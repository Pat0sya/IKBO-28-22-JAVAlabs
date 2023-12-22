package mirea.javalabs.lab16;

//public class Exception2 {
//    public void exceptionDemo() {
//        Scanner myScanner = new Scanner(System.in);
//        try {
//            System.out.print("Enter an integer: ");
//            String intString = myScanner.next();
//            int i = Integer.parseInt(intString);
//            System.out.println(2 / i);
//        } catch (NumberFormatException e) {
//            System.out.println("Invalid input. Please enter a valid integer.");
//        }
//    }
//
//    public static void main(String[] args) {
//        Exception2 demo = new Exception2();
//        demo.exceptionDemo();
//    }
//}
//import java.util.Scanner;
//
//public class Exception2 {
//    public void exceptionDemo() {
//        Scanner myScanner = new Scanner(System.in);
//        try {
//            System.out.print("Enter an integer: ");
//            String intString = myScanner.next();
//            int i = Integer.parseInt(intString);
//            System.out.println(2 / i);
//        } catch (NumberFormatException e) {
//            System.out.println("Invalid input. Please enter a valid integer.");
//        } catch (ArithmeticException e) {
//            System.out.println("Cannot divide by zero.");
//        } catch (Exception e) {
//            System.out.println("An unexpected error occurred.");
//        }
//    }
//
//    public static void main(String[] args) {
//        Exception2 demo = new Exception2();
//        demo.exceptionDemo();
//    }
//}
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static void main(String[] args) {
        Exception2 demo = new Exception2();
        demo.exceptionDemo();
    }
}
