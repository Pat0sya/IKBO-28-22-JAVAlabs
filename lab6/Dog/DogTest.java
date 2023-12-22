package mirea.javalabs.lab6.Dog;

public class DogTest {
    public static void main(String[] args) {
        Labrador labrador = new Labrador("Барон", 3);
        Bulldog bulldog = new Bulldog("Макс", 2);

        System.out.println("Информация о собаках:");
        labrador.bark();
        bulldog.bark();
    }
}