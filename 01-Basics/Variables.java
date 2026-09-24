/*
 * Variables.java
 * Demonstrates declaring and using variables in Java.
 */
public class Variables {
    public static void main(String[] args) {
        // Declaring and initializing variables
        int age = 20;
        double height = 5.9;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Alice";

        // Printing variable values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);

        // Reassigning a variable
        age = 21;
        System.out.println("Updated Age: " + age);
    }
}
