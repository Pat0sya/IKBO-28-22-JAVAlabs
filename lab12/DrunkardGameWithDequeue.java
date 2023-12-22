package mirea.javalabs.lab12;

import java.util.LinkedList;
import java.util.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DrunkardGameWithDequeue {
    public static void main(String[] args) {
        Deque<Integer> player1Deque = new ArrayDeque<>();
        Deque<Integer> player2Deque = new ArrayDeque<>();

        initializeDecks(player1Deque, player2Deque);

        int rounds = 0;

        while (!player1Deque.isEmpty() && !player2Deque.isEmpty() && rounds < 106) {
            int card1 = player1Deque.poll();
            int card2 = player2Deque.poll();

            if (card1 == 0 && card2 == 9) {
                player1Deque.offer(card1);
                player1Deque.offer(card2);
            } else if (card1 == 9 && card2 == 0) {
                player2Deque.offer(card1);
                player2Deque.offer(card2);
            } else if (card1 > card2) {
                player1Deque.offer(card1);
                player1Deque.offer(card2);
            } else {
                player2Deque.offer(card1);
                player2Deque.offer(card2);
            }

            rounds++;

            if (rounds >= 106) {
                System.out.println("botva with Deque");
                break;
            }
        }

        if (player1Deque.isEmpty()) {
            System.out.println("first " + rounds);
        } else if (player2Deque.isEmpty()) {
            System.out.println("second " + rounds);
        }
    }

    private static void initializeDecks(Deque<Integer> player1, Deque<Integer> player2) {
        player1.offer(1);
        player1.offer(3);
        player1.offer(5);
        player1.offer(7);
        player1.offer(9);

        player2.offer(2);
        player2.offer(4);
        player2.offer(6);
        player2.offer(8);
        player2.offer(0);
    }
}
