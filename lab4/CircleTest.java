package mirea.javalabs.lab4;


public class CircleTest {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0);


        double radius = circle.getRadius();
        double area = circle.calculateArea();


        System.out.println("Радиус окружности: " + radius);
        System.out.println("Площадь окружности: " + area);


        circle.setRadius(7.5);
        radius = circle.getRadius();
        area = circle.calculateArea();

        System.out.println("Новый радиус окружности: " + radius);
        System.out.println("Новая площадь окружности: " + area);
    }
}





