package mirea.javalabs.lab5.Movable;

public class MovableCircle implements Movable{
    private MovablePoint center;
    private int radius;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public void moveUp(){
        center.y -= center.ySpeed;
    }
    public void moveDown(){
        center.y += center.ySpeed;
    }
    public void moveRight(){
        center.x += center.xSpeed;
    }
    public void moveLeft(){
        center.x -= center.xSpeed;
    }
    public String toString(){
        return String.format("Круг на точке %1$s с радиусом: %2$d", center.toString(), radius);
    }
}
