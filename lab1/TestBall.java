package mirea.javalabs.lab1;

import java.lang.*;
public class TestBall {
    public static void main(String[] args){
        Ball ball = new Ball("Blue", 10.0);
        System.out.println("Colour: " + ball.getColour());
        System.out.println("Radius: " + ball.getRadius());
        ball.bounce();
        ball.roll();
    }
}
