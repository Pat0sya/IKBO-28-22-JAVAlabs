package mirea.javalabs.lab6.Dish;


class Plate extends Dish {
    private boolean isMicrowaveSafe;

    public Plate(String material, int diameter, boolean isMicrowaveSafe) {
        super(material, diameter);
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public void displayInfo() {
        System.out.println("Тарелка из материала: " + getMaterial());
        System.out.println("Диаметр: " + getDiameter() + " см");
        System.out.println("Можно использовать в микроволновой печи: " + isMicrowaveSafe);
    }
}