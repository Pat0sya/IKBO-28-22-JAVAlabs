package mirea.javalabs.lab3;

public class Ball {
    double x = 0.0;
    double y = 0.0;
    public Ball(){}
    public Ball(double x, double y){
        this.x = x;
        this.y = y;

    }
    public double getX(){
        return x;

    }
    public double getY(){
        return y;

    }
    public void setX(){
        this.x = x;

    }
    public void setY(){
        this.y = y;

    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;

    }
    public void move(double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }
    @Override
    public String toString(){
        return "Ball @ ("+this.x+", "+this.y+").";
    }

}
