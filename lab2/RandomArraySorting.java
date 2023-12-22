package mirea.javalabs.lab2;

import java.util.Arrays;
import java.util.Random;

public class RandomArraySorting {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        // Заполняем массив случайными числами
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // случайное число от 0 до 99
        }

        // Выводим исходный массив
        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        // Сортируем массив
        Arrays.sort(numbers);

        // Выводим отсортированный массив
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));
    }
}
