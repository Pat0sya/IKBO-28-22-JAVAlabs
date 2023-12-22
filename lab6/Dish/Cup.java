package mirea.javalabs.lab6.Dish;

class Cup extends Dish {
    private int capacity;

    public Cup(String material, int diameter, int capacity) {
        super(material, diameter);
        this.capacity = capacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Чашка из материала: " + getMaterial());
        System.out.println("Диаметр: " + getDiameter() + " см");
        System.out.println("Вместимость: " + capacity + " мл");
    }
}
