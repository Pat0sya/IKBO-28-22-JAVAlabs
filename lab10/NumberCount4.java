package mirea.javalabs.lab10;

public class NumberCount4 {
    public static void main(String[] args) {
        int k = 3;
        int s = 15;
        int d = 5;
        int result = countNumbers(k, s, d);
        System.out.println(result);
    }

    public static int countNumbers(int k, int s, int d) {
        return generateNumbers(k, s, d, 0, 0);
    }

    public static int generateNumbers(int k, int s, int d, int digitSum, int number) {
        if (k == 0) {
            if (digitSum == d) {
                return 1;
            }
            return 0;
        }

        int count = 0;
        for (int i = (number == 0) ? 1 : 0; i <= 9; i++) {
            if (digitSum + i > s) {
                break;
            }
            count += generateNumbers(k - 1, s, d, digitSum + i, number * 10 + i);
        }
        return count;
    }
}
