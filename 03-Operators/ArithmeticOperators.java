/*
 * ArithmeticOperators.java
 * Demonstrates +, -, *, /, % operators.
 */
public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 15, b = 4;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));   // integer division -> 3
        System.out.println("a % b = " + (a % b));   // remainder -> 3

        double x = 15.0, y = 4.0;
        System.out.println("x / y = " + (x / y));   // real division -> 3.75
    }
}
