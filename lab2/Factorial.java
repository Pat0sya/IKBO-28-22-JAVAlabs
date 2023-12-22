package mirea.javalabs.lab2;

public class Factorial {
    public static void main(String[] args) {
        int n = 5; // Пример: вычисление факториала для числа 5
        long result = computeFactorial(n);
        System.out.println("Факториал числа " + n + " равен " + result);
    }

    public static long computeFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
