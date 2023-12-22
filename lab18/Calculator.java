package mirea.javalabs.lab18;

public class Calculator {
    public static <T extends Number, U extends Number> T sum(T a, U b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        }
    }

    public static <T extends Number, U extends Number> T multiply(T a, U b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        }
    }

    public static <T extends Number, U extends Number> T divide(T a, U b) {
        if (b.doubleValue() == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
    }

    public static <T extends Number, U extends Number> T subtraction(T a, U b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        }
    }
}
