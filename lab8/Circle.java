package mirea.javalabs.lab8wip;

import java.awt.*;

class Circle extends Shape{
    private int radius;
    public Circle(Color color, int x, int y, int radius){
        super(color, x, y);
        this.radius = radius;
    }
    @Override
    public void draw(Graphics g){
        g.getColor();
        g.fillOval(getX(), getY(),2*radius, 2*radius);
    }
}
