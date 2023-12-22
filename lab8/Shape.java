package mirea.javalabs.lab8wip;
import java.awt.*;

abstract class Shape {
    private Color color;
    private int x;
    private int y;
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public Color getColor() {
        return color;
    }
    public Shape(Color color, int x, int y){
        this.color = color;
        this.x = x;
        this.y = y;
    }
    public abstract void draw(Graphics g);
}
