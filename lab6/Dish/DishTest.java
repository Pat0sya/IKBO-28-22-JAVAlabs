package mirea.javalabs.lab6.Dish;

public class DishTest {
    public static void main(String[] args) {
        Plate plate = new Plate("Керамика", 20, true);
        Cup cup = new Cup("Порцелян", 10, 250);

        System.out.println("Информация о тарелке:");
        plate.displayInfo();

        System.out.println("\nИнформация о чашке:");
        cup.displayInfo();
    }
}