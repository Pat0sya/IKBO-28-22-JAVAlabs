package mirea.javalabs.lab4;

public class Circle {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Радиус должен быть положительным числом.");
        }
    }
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }


}
