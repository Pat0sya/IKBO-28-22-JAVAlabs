package mirea.javalabs.lab12;

import java.util.Stack;

public class DrunkardGameWithStack {
    public static void main(String[] args) {
        Stack<Integer> player1Stack = new Stack<>();
        Stack<Integer> player2Stack = new Stack<>();

        initializeDecks(player1Stack, player2Stack);

        int rounds = 0;

        while (!player1Stack.isEmpty() && !player2Stack.isEmpty() && rounds < 106) {
            int card1 = player1Stack.pop();
            int card2 = player2Stack.pop();

            if (card1 == 0 && card2 == 9) {
                player1Stack.push(card1);
                player1Stack.push(card2);
            } else if (card1 == 9 && card2 == 0) {
                player2Stack.push(card1);
                player2Stack.push(card2);
            } else if (card1 > card2) {
                player1Stack.push(card1);
                player1Stack.push(card2);
            } else {
                player2Stack.push(card1);
                player2Stack.push(card2);
            }

            rounds++;

            if (rounds >= 106) {
                System.out.println("botva");
                break;
            }
        }

        if (player1Stack.isEmpty()) {
            System.out.println("first "+ rounds);
        } else if (player2Stack.isEmpty()) {
            System.out.println("second " + rounds);
        }
    }

    private static void initializeDecks(Stack<Integer> player1, Stack<Integer> player2) {
        player1.push(1);
        player1.push(3);
        player1.push(5);
        player1.push(7);
        player1.push(9);

        player2.push(2);
        player2.push(4);
        player2.push(6);
        player2.push(8);
        player2.push(0);
    }
}
