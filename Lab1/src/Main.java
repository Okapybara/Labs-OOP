public class Main {
    public static void main(String[] args) {

        Weapon knife = new Weapon("Охотничий нож", 0.3, "холодное");
        Firearm rifle = new Firearm("Ружье", 4.3, 8, 10);
        Pistol pistol = new Pistol("Пистолет", 0.73, 9, 8, "Тульский завод", true, "чёрный");

        System.out.println("Созданы: " + knife.getName() + ", " + rifle.getName() + ", " + pistol.getName() + "\n");

        System.out.println("Демонстрация сеттеров и геттеров:");
        // нож
        knife.setName("Обычный нож");
        System.out.println("После setName: " + knife.getName());
        knife.setWeight(1.5);
        System.out.println("После setWeight: " + knife.getWeight() + " кг");
        knife.setType("туристическое");
        System.out.println("После setType: " + knife.getType());

        // винтовка
        rifle.setCaliber(12);
        System.out.println("После setCaliber: " + rifle.getCaliber() + " мм");
        rifle.setMagazineSize(15);
        System.out.println("После setMagazineSize: " + rifle.getMagazineSize());
        rifle.setCartridgeCount(5);
        System.out.println("После setCartridgeCount: " + rifle.getCartridgeCount());

        // пистолет
        pistol.setBrand("Московский завод");
        System.out.println("После setBrand: " + pistol.getBrand());
        pistol.setSafetyOn(false);
        System.out.println("После setSafetyOn: " + pistol.isSafetyOn());
        pistol.setColor("серебристый");
        System.out.println("После setColor: " + pistol.getColor());

        System.out.println("\nРабота собственных методов Weapon");
        knife.use();
        knife.info();
        knife.repair();

        System.out.println("\nРабота собственных методов Firearm");
        rifle.shoot();
        rifle.shoot();
        rifle.reload();
        rifle.clean();
        rifle.info();

        System.out.println("\nРабота собственных методов Pistol");
        pistol.holsterOut();
        pistol.shoot();
        pistol.reload();
        pistol.shoot();
        pistol.changeSafety();
        pistol.shoot();
        pistol.changeSafety();
        pistol.shoot();
        pistol.holsterIn();
        pistol.info();

        System.out.println("\nДемонстрация полиморфизма");
        Weapon[] arsenal = {knife, rifle, pistol};

        System.out.println("Арсенал:");
        for (Weapon weapon : arsenal) {
            weapon.info();
        }

        System.out.println("\nПроверка наследования (instanceof)");
        System.out.println("knife instanceof Weapon: " + (knife instanceof Weapon));
        System.out.println("rifle instanceof Weapon: " + (rifle instanceof Weapon));
        System.out.println("rifle instanceof Firearm: " + (rifle instanceof Firearm));
        System.out.println("pistol instanceof Weapon: " + (pistol instanceof Weapon));
        System.out.println("pistol instanceof Firearm: " + (pistol instanceof Firearm));
        System.out.println("pistol instanceof Pistol: " + (pistol instanceof Pistol));
    }
}
