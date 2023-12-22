package mirea.javalabs.lab6.Furniture;

class Table extends Furniture {
    private String material;

    public Table(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стол '" + getName() + "' из материала " + material + ", цена: " + getPrice() + " руб.");
    }
}