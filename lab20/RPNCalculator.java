package mirea.javalabs.lab20;

import java.util.Stack;

public class RPNCalculator {

    public static double evaluateRPN(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(token, operand1, operand2);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static double performOperation(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+" -> {
                return operand1 + operand2;
            }
            case "-" -> {
                return operand1 - operand2;
            }
            case "*" -> {
                return operand1 * operand2;
            }
            case "/" -> {
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    throw new ArithmeticException("Division by zero");
                }
            }
            default -> throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }

    public static void main(String[] args) {

        String rpnExpression = "3 4 + 2 *";
        double result = evaluateRPN(rpnExpression);
        System.out.println("Result: " + result);
    }
}
