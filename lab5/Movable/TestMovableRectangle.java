package mirea.javalabs.lab5.Movable;

public class TestMovableRectangle {
    public static void main(String[] args){
        Movable move1 = new MovableRectangle(0, 0, 50, 50, 10, 10);
        System.out.println(move1);
        move1.moveLeft();
        System.out.println(move1);


        Movable move2 = new MovableRectangle(0, 0, 6, 2, 10, 10);
        System.out.println(move2);
        move2.moveLeft();
        System.out.println(move2);
    }
}