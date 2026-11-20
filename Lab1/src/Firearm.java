public class Firearm extends Weapon{
    private int caliber; // калибр
    private int magazineSize; // размер магазина
    private int countCartridge; //текущее кол-во патронов

    public Firearm(String name, double weight, int caliber, int magazineSize) {
        super(name, weight, "огнестрельное");
        this.caliber = caliber;
        this.magazineSize = magazineSize;
        this.countCartridge = 0;
    }

    public void shoot() {
        if (countCartridge > 0) {
            countCartridge--;
            System.out.println("Выстрел! Осталось патронов: " + countCartridge);
        }
        else {
            System.out.println("Нет патронов!");
        }
    }

    public void reload() {
        countCartridge = magazineSize;
        System.out.println("Перезаряжено. Патронов: " + magazineSize);
    }

    public void clean() {
        System.out.println(getName() + " почищено");
    }

    @Override
    public void use() {
        shoot();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Калибр: " + caliber + " мм");
        System.out.println("Магазин: " + magazineSize + " патронов");
        System.out.println("Патронов сейчас: " + countCartridge);
    }

    public int getCaliber() {
        return caliber;
    }

    public void setCaliber(int caliber) {
        this.caliber = caliber;
    }

    public int getMagazineSize() {
        return magazineSize;
    }

    public void setMagazineSize(int magazineSize) {
        this.magazineSize = magazineSize;
    }

    public int getCartridgeCount() {
        return countCartridge;
    }

    public void setCartridgeCount(int countCartridge) {
        this.countCartridge = countCartridge;
    }
}
