package mirea.javalabs.lab2;

public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        // С использованием цикла for
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Сумма (for): " + sum);

        // С использованием цикла while
        sum = 0;
        int index = 0;
        while (index < numbers.length) {
            sum += numbers[index];
            index++;
        }
        System.out.println("Сумма (while): " + sum);

        // С использованием цикла do-while
        sum = 0;
        index = 0;
        do {
            sum += numbers[index];
            index++;
        } while (index < numbers.length);
        System.out.println("Сумма (do-while): " + sum);
    }
}
