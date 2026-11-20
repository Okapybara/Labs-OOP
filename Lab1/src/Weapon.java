public class Weapon {
    private String name;
    private double weight; // в кг
    private String type; // холодное, огнестрельное и тд

    public Weapon(String name, double weight, String type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public void use() {
        System.out.println("Используется: " + name);
    }

    public void info() {
        System.out.println("Оружие: " + name);
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Тип: " + type);
    }

    public void repair() {
        System.out.println(name + " отремонтирован");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
