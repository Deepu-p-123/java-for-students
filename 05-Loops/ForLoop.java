/*
 * ForLoop.java
 * Demonstrates the classic for loop and the for-each loop.
 */
public class ForLoop {
    public static void main(String[] args) {
        // Classic for loop: print numbers 1 to 5
        System.out.println("Numbers 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // For loop counting down
        System.out.println("\nCountdown from 5:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        // For-each loop over an array
        System.out.println("\nFor-each over an array:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
