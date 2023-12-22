package mirea.javalabs.lab5.Movable;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);

    }
    @Override
    public void moveUp(){
        if ( !SameSpeed()){
            return;
        }
        topLeft.y -=topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }
    @Override
    public void moveDown(){
        if ( !SameSpeed()){
            return;
        }
        topLeft.y +=topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }
    @Override
    public void moveRight(){
        if ( !SameSpeed()){
            return;
        }
        topLeft.x +=topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
    @Override
    public void moveLeft(){
        if ( !SameSpeed()){
            return;
        }
        topLeft.x -=topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }
    private boolean SameSpeed(){
        return (topLeft.xSpeed == bottomRight.xSpeed) && (topLeft.ySpeed == bottomRight.ySpeed);
    }
    @Override
    public String toString(){
        return String.format("Прямоугольник лево-верх: %1$s и право-низ: %2$s", topLeft.toString(), bottomRight.toString());
    }

}
