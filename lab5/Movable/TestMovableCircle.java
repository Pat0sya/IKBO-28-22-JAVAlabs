package mirea.javalabs.lab5.Movable;

public class TestMovableCircle {
    public static void main(String[] args){
        Movable move1 = new MovablePoint(6,5,10,20);
        System.out.println(move1);
        move1.moveLeft();
        System.out.println(move1);


        Movable move2 = new MovableCircle(2,1,2,20);
        System.out.println(move2);
        move2.moveLeft();
        System.out.println(move2);
    }
}
