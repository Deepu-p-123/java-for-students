/*
 * NestedIf.java
 * Demonstrates an if statement nested inside another if statement.
 */
public class NestedIf {
    public static void main(String[] args) {
        int age = 20;
        boolean hasLicense = true;

        if (age >= 18) {
            System.out.println("You are an adult.");
            if (hasLicense) {
                System.out.println("You are allowed to drive.");
            } else {
                System.out.println("You need a license to drive.");
            }
        } else {
            System.out.println("You are a minor. Driving not allowed.");
        }

        // Nested if for finding the largest of three numbers
        int a = 12, b = 25, c = 19;
        if (a > b) {
            if (a > c) {
                System.out.println("Largest: " + a);
            } else {
                System.out.println("Largest: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Largest: " + b);
            } else {
                System.out.println("Largest: " + c);
            }
        }
    }
}
