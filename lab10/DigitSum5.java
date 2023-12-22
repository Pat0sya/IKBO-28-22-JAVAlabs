package mirea.javalabs.lab10;

import java.util.Scanner;

public class DigitSum5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int N = scanner.nextInt();
        scanner.close();
        int sum = calcDigitSum(N);


        System.out.println("Сумма всех цифр числа: "+sum);
    }
    public static int calcDigitSum(int N){
        if (N<10){
            return N;
        }else{
            return N%10+calcDigitSum(N/10);
        }
    }
}
