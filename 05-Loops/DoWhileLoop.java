/*
 * DoWhileLoop.java
 * Demonstrates the do-while loop, which runs the body AT LEAST ONCE
 * because the condition is checked AFTER the iteration.
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 1;

        System.out.println("Counting to 5 using do-while loop:");
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);

        // Demonstrating that the body runs at least once even if condition is false
        int x = 10;
        System.out.println("\nDemo: runs once even though condition is false:");
        do {
            System.out.println("This runs at least once. x = " + x);
        } while (x < 5);
    }
}
