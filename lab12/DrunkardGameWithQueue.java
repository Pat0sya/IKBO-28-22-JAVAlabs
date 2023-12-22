package mirea.javalabs.lab12;

import java.util.LinkedList;
import java.util.Queue;

public class DrunkardGameWithQueue {
    public static void main(String[] args) {
        Queue<Integer> player1Queue = new LinkedList<>();
        Queue<Integer> player2Queue = new LinkedList<>();

        initializeDecks(player1Queue, player2Queue);

        int rounds = 0;

        while (!player1Queue.isEmpty() && !player2Queue.isEmpty() && rounds < 106) {
            int card1 = player1Queue.poll();
            int card2 = player2Queue.poll();

            if (card1 == 0 && card2 == 9) {
                player1Queue.offer(card1);
                player1Queue.offer(card2);
            } else if (card1 == 9 && card2 == 0) {
                player2Queue.offer(card1);
                player2Queue.offer(card2);
            } else if (card1 > card2) {
                player1Queue.offer(card1);
                player1Queue.offer(card2);
            } else {
                player2Queue.offer(card1);
                player2Queue.offer(card2);
            }

            rounds++;

            if (rounds >= 106) {
                System.out.println("botva");
                break;
            }
        }

        if (player1Queue.isEmpty()) {
            System.out.println("first " + rounds);
        } else if (player2Queue.isEmpty()) {
            System.out.println("second " + rounds);
        }
    }

    private static void initializeDecks(Queue<Integer> player1, Queue<Integer> player2) {
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
