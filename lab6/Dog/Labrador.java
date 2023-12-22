package mirea.javalabs.lab6.Dog;

class Labrador extends Dog {
    public Labrador(String name, int age) {
        super(name, age, "Лабрадор");
    }

    @Override
    public void bark() {
        System.out.println("Лабрадор " + getName() + " гавкает: Гав-гав!");
    }
}