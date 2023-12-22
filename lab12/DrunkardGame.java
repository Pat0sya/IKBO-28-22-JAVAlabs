package mirea.javalabs.lab12;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class DrunkardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите карты первого игрока (от 0 до 9): ");
        String player1Input = scanner.nextLine();
        System.out.println("Введите карты второго игрока (от 0 до 9): ");
        String player2Input = scanner.nextLine();

        Queue<Integer> player1 = new ArrayDeque<>();
        Queue<Integer> player2 = new ArrayDeque<>();

        // Заполнение 1
        for (int i = 0; i < 5; i++) {
            int card = Character.getNumericValue(player1Input.charAt(i));
            player1.add(card);
        }

        // Заполнение 2
        for (int i = 0; i < 5; i++) {
            int card = Character.getNumericValue(player2Input.charAt(i));
            player2.add(card);
        }

        int rounds = 0;


        while (!player1.isEmpty() && !player2.isEmpty() && rounds < 106) {
            int card1 = player1.poll();
            int card2 = player2.poll();

            if (card1 == 0 && card2 == 9) {
                player1.add(card1);
                player1.add(card2);
            } else if (card1 == 9 && card2 == 0) {

                player2.add(card1);
                player2.add(card2);
            } else if (card1 > card2) {

                player1.add(card1);
                player1.add(card2);
            } else {

                player2.add(card1);
                player2.add(card2);
            }

            rounds++;

            if (rounds >= 106) {
                System.out.println("botva");
                break;
            }
        }

        if (player1.isEmpty()) {
            System.out.println("first " + rounds);
        } else if (player2.isEmpty()) {
            System.out.println("second " + rounds);
        }
    }
}
