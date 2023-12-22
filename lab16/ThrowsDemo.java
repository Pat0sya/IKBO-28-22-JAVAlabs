package mirea.javalabs.lab16;

//public class ThrowsDemo {
//    public void getDetails(String key) {
//        if (key == null) {
//            throw new NullPointerException("null key in getDetails");
//        }
//        // do something with the key
//    }
//
//    public static void main(String[] args) {
//        ThrowsDemo demo = new ThrowsDemo();
//        try {
//            demo.getDetails(null);
//        } catch (NullPointerException e) {
//            System.out.println(e);
//        }
//    }
//}
//public class ThrowsDemo {
//    public void printMessage(String key) {
//        try {
//            String message = getDetails(key);
//            System.out.println(message);
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException caught: " + e.getMessage());
//        }
//    }
//
//    public String getDetails(String key) {
//        if (key == null) {
//            throw new NullPointerException("null key in getDetails");
//        }
//        return "data for " + key;
//    }
//
//    public static void main(String[] args) {
//        ThrowsDemo demo = new ThrowsDemo();
//        demo.printMessage(null); // NullPointerException caught: null key in getDetails
//    }
//}
//public class ThrowsDemo {
//    public void printMessage(String key) {
//        try {
//            String message = getDetails(key);
//            System.out.println(message);
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException caught: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//    }
//
//    public String getDetails(String key) {
//        if (key == null) {
//            throw new NullPointerException("null key in getDetails");
//        }
//        return "data for " + key;
//    }
//
//    public static void main(String[] args) {
//        ThrowsDemo demo = new ThrowsDemo();
//        demo.printMessage(null); // NullPointerException caught: null key in getDetails
//        demo.printMessage("validKey"); // data for validKey
//    }
//}
//import java.util.Scanner;
//
//public class ThrowsDemo {
//    public void getKey() {
//        Scanner myScanner = new Scanner(System.in);
//        String key = myScanner.next();
//        try {
//            printDetails(key);
//        } catch (Exception e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//    }
//
//    public void printDetails(String key) throws Exception {
//        String message = getDetails(key);
//        System.out.println(message);
//    }
//
//    private String getDetails(String key) throws Exception {
//        if (key.equals("")) {
//            throw new Exception("Key set to an empty string");
//        }
//        return "data for " + key;
//    }
//
//    public static void main(String[] args) {
//        ThrowsDemo demo = new ThrowsDemo();
//        demo.getKey();
//    }
//}
import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean isValidKey = false;

        while (!isValidKey) {
            try {
                System.out.print("Enter a non-empty key: ");
                String key = myScanner.next();
                printDetails(key);
                isValidKey = true;
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to an empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}
