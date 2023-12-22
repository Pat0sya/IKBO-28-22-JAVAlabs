package mirea.javalabs.lab4;

public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("Серый");
        Leg leftLeg = new Leg(80);
        Leg rightLeg = new Leg(80);
        Hand leftHand = new Hand(true);
        Hand rightHand = new Hand(true);
        Human person = new Human(head, leftLeg, rightLeg, leftHand, rightHand);


        person.performActions();
    }
}
