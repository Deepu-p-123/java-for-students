import java.util.Scanner;

/*
 * ArithmeticWithScanner.java
 * Reads two numbers from the user and performs basic arithmetic.
 */
public class ArithmeticWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Quotient: " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero!");
        }

        scanner.close();
    }
}
