/*
 * OneDimensionalArray.java
 * Demonstrates declaring, initializing, and traversing a 1D array.
 */
public class OneDimensionalArray {
    public static void main(String[] args) {
        // Declaration and initialization
        int[] marks = {85, 92, 78, 65, 90};

        // Accessing elements
        System.out.println("First mark: " + marks[0]);
        System.out.println("Last mark: " + marks[marks.length - 1]);

        // Traversing with a for loop
        System.out.println("\nAll marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Index " + i + ": " + marks[i]);
        }

        // Finding the sum and average
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.length;
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);

        // Finding the maximum
        int max = marks[0];
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        System.out.println("Maximum: " + max);
    }
}
