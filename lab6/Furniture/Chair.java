package mirea.javalabs.lab6.Furniture;

class Chair extends Furniture {
    private int numberOfLegs;

    public Chair(String name, double price, int numberOfLegs) {
        super(name, price);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стул '" + getName() + "' с " + numberOfLegs + " ножками, цена: " + getPrice() + " руб.");
    }
}