/*
 * LogicalOperators.java
 * Demonstrates &&, ||, and ! logical operators.
 */
public class LogicalOperators {
    public static void main(String[] args) {
        boolean isAdult = true;
        boolean hasID = false;

        System.out.println("isAdult && hasID : " + (isAdult && hasID)); // both must be true
        System.out.println("isAdult || hasID : " + (isAdult || hasID)); // at least one true
        System.out.println("!isAdult         : " + (!isAdult));         // negation

        int age = 25;
        // Common real-world usage: combining conditions
        boolean canVote = (age >= 18) && (age < 120);
        System.out.println("canVote: " + canVote);
    }
}
