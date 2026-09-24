/*
 * IfElse.java
 * Demonstrates if, if-else, and if-else-if ladder statements.
 */
public class IfElse {
    public static void main(String[] args) {
        int marks = 78;

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        // Simple if-else
        int number = -5;
        if (number >= 0) {
            System.out.println(number + " is non-negative");
        } else {
            System.out.println(number + " is negative");
        }
    }
}
