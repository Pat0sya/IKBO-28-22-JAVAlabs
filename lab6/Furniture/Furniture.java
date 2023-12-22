package mirea.javalabs.lab6.Furniture;

public abstract class Furniture {
    private String name;
    private double price;

    // Конструктор
    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Метод для вывода информации о мебели
    public abstract void displayInfo();

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
