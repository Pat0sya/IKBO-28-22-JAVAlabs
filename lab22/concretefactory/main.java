package mirea.javalabs.lab22.concretefactory;

public class main {
    public static void main(String[] args) {
        // Используем фабрику
        ComplexAbstractFactory factory = new ConcreteFactory();

        // Создаем комплексное число без параметров
        Complex complex1 = factory.createComplex();
        System.out.println("Complex 1: Real = " + complex1.getReal() + ", Imaginary = " + complex1.getImaginary());

        // Создаем комплексное число с параметрами
        Complex complex2 = factory.createComplex(5, 10);
        System.out.println("Complex 2: Real = " + complex2.getReal() + ", Imaginary = " + complex2.getImaginary());
    }
}