package mirea.javalabs.lab1;
import java.lang.*;
public class Ball {
    private String colour;
    private double radius;
    public Ball(String colour, double radius){
        this.colour = colour;
        this.radius = radius;

    }
    public String getColour(){
        return colour;

    }
    public void setColour(String colour){
        this.colour = colour;

    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius =  radius;

    }
    public void bounce(){
        System.out.println("The ball is bouncy!");
    }
    public void roll(){
        System.out.println("The ball is rolly!");

    }
}
