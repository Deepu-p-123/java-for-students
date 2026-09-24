/*
 * WhileLoop.java
 * Demonstrates the while loop, which checks the condition BEFORE each iteration.
 */
public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;

        System.out.println("Counting to 5 using while loop:");
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Example: sum of digits of a number using while loop
        int number = 12345;
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits of " + number + " = " + sum);
    }
}
