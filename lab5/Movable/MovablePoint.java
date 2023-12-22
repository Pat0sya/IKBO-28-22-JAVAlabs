package mirea.javalabs.lab5.Movable;

public class MovablePoint implements Movable{
    int x, y, xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public void moveUp(){
        y -= ySpeed;
    }
    @Override
    public void moveDown(){
        y += ySpeed;
    }
    @Override
    public void moveRight(){
        x -= xSpeed;
    }
    @Override
    public void moveLeft(){
        x += xSpeed;
    }
    @Override
    public String toString(){
        return String.format("Точка (%1$d, %2$d) со скоростью по x: %3$d и по y: %4$d", x,y,xSpeed,ySpeed);
    }

}
