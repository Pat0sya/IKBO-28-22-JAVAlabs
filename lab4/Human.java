package mirea.javalabs.lab4;

public class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;
    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }
    public void performActions(){
        head.talk();
        leftLeg.walk();
        rightLeg.walk();
        leftHand.grab();
        rightHand.grab();
    }
}
class Leg{
    private int length;
    public Leg(int length){
        this.length=length;
    }
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length=length;

    }
    public void walk(){
        System.out.println("Нога идет");
    }
}
class Head{
    private String hairColor;
    public Head(String hairColor){
        this.hairColor=hairColor;
    }
    public String getHairColor(){
        return hairColor;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public void talk(){
        System.out.println("Голова говорит");
    }

}
class Hand{
    private boolean fingers;
    public Hand(boolean fingers){
        this.fingers=fingers;
    }
    public boolean getFingers(){
        return fingers;
    }
    public void setFingers(boolean fingers){
        this.fingers=fingers;
    }
    public void grab(){
        System.out.println("Рука сжимает");
    }
}