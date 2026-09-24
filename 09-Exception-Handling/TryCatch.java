/*
 * TryCatch.java
 * Demonstrates handling exceptions with try-catch, including
 * catching multiple exception types and multi-catch syntax.
 */
public class TryCatch {
    public static void main(String[] args) {
        // Example 1: ArithmeticException
        try {
            int a = 10, b = 0;
            int result = a / b; // throws ArithmeticException
            System.out.println("Result: " + result); // never reached
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. (" + e.getMessage() + ")");
        }

        // Example 2: ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index. (" + e.getMessage() + ")");
        }

        // Example 3: NumberFormatException
        try {
            String text = "abc";
            int number = Integer.parseInt(text); // cannot convert "abc" to int
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. (" + e.getMessage() + ")");
        }

        // Example 4: Multi-catch - handling multiple exception types with one block
        try {
            Object obj = null;
            System.out.println(obj.toString()); // NullPointerException
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Caught either NullPointerException or ArithmeticException: " + e);
        }

        System.out.println("\nProgram continues normally after handling exceptions.");
    }
}
