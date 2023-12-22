package mirea.javalabs.lab12;

import java.util.LinkedList;
import java.util.Queue;


public class DrunkardGameWithDoubleList {
    public static void main(String[] args) {
        DoubleList<Integer> player1List = new DoubleList<>();
        DoubleList<Integer> player2List = new DoubleList<>();

        initializeDecks(player1List, player2List);

        int rounds = 0;

        while (!player1List.isEmpty() && !player2List.isEmpty() && rounds < 106) {
            int card1 = player1List.removeFirst();
            int card2 = player2List.removeFirst();

            if (card1 == 0 && card2 == 9) {
                player1List.add(card1);
                player1List.add(card2);
            } else if (card1 == 9 && card2 == 0) {
                player2List.add(card1);
                player2List.add(card2);
            } else if (card1 > card2) {
                player1List.add(card1);
                player1List.add(card2);
            } else {
                player2List.add(card1);
                player2List.add(card2);
            }

            rounds++;

            if (rounds >= 106) {
                System.out.println("botva");
                break;
            }
        }

        if (player1List.isEmpty()) {
            System.out.println("first " + rounds);
        } else if (player2List.isEmpty()) {
            System.out.println("second " + rounds);
        }
    }

    private static void initializeDecks(DoubleList<Integer> player1, DoubleList<Integer> player2) {
        player1.add(1);
        player1.add(3);
        player1.add(5);
        player1.add(7);
        player1.add(9);

        player2.add(2);
        player2.add(4);
        player2.add(6);
        player2.add(8);
        player2.add(0);
    }
}
