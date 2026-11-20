public class Pistol extends Firearm {
    private String brand; // марка пистолета
    private boolean safetyOn; // включен ли предохранитель
    private String color;

    public Pistol(String name, double weight, int caliber, int magazineSize, String brand, boolean safetyOn, String color) {
        super(name, weight, caliber, magazineSize);
        this.brand = brand;
        this.safetyOn = safetyOn;
        this.color = color;
    }

    public void holsterOut() {
        System.out.println(getName() + " достать из кобуры");
    }

    public void holsterIn() {
        System.out.println(getName() + " убран в кобуру");
    }

    public void changeSafety() {
        safetyOn = !safetyOn;
        if (safetyOn) {
            System.out.println("Предохранитель включен");
        }
        else {
            System.out.println("Предохранитель выключен");
        }
    }

    @Override
    public void shoot() {
        if (safetyOn) {
            System.out.println("Выстрел невозможен, так как включен предохранитель.");
        }
        else {
            super.shoot();
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Марка: " + brand);
        System.out.println("Цвет: " + color);
        System.out.println("Предохранитель: " + (safetyOn ? "включен" : "выключен"));
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isSafetyOn() {
        return safetyOn;
    }

    public void setSafetyOn(boolean safetyOn) {
        this.safetyOn = safetyOn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
