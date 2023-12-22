package mirea.javalabs.lab10;

import java.util.Scanner;

public class PrimeFactors7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("Простые множители числа "+n+":");
        printPrimeFactors(n, 2);
    }
    public static void printPrimeFactors(int n, int divisor){
        if (n <= 1){
            return;
        }
        if (n%divisor==0){
            System.out.print(divisor+ " ");
            printPrimeFactors(n/divisor,divisor);

        }else{
            printPrimeFactors(n, divisor+1);
        }
    }
}
