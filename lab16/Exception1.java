package mirea.javalabs.lab16;

//public class Exception1 {
//    public void exceptionDemo() {
//        // Шаг 1
//        // System.out.println(2 / 0);
//
//        // Шаг 2
//        System.out.println(2.0 / 0.0);
//    }
//
//    public static void main(String[] args) {
//        Exception1 demo = new Exception1();
//        demo.exceptionDemo();
//    }
//}
public class Exception1 {
    public void exceptionDemo() {
        try {
            // Шаг 2
            // System.out.println(2.0 / 0.0);

            // Шаг 3
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception1 demo = new Exception1();
        demo.exceptionDemo();
    }
}
