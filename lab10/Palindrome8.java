package mirea.javalabs.lab10;

import java.util.Scanner;

public class Palindrome8 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scanner.nextLine();
        scanner.close();


        boolean isPalindrome = checkPalindrome(word);
        if (isPalindrome) {
            System.out.println("Слово является полиндромом");

        } else {
            System.out.println("Слово не является полиндромом");

        }
    }
    public static boolean checkPalindrome(String word){
        if (word.length()<=1){
            return true;
        }
        if (word.charAt(0) != word.charAt(word.length()-1)){
            return false;
        }
        return checkPalindrome(word.substring(1, word.length()-1));
    }
}
