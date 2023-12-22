package mirea.javalabs.lab10;

import java.util.Scanner;

public class PrimeNumber6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int n = scanner.nextInt();
        scanner.close();
        boolean isPrime = isPrimeNum(n, 2);
        if (isPrime){
            System.out.println("Число простое");

        }else {
            System.out.println("Число ух какое непростое");
        }
    }
    public static boolean isPrimeNum(int n, int divisor){
        if (n<=2){
            return(n==2);
            }
        if (n%divisor==0){
            return false;
        }
        if (divisor*divisor>n){
            return true;
        }
        return isPrimeNum(n, divisor+1);
    }
}
