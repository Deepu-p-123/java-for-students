import java.util.Scanner;

/*
 * ScannerInput.java
 * Demonstrates reading basic input from the user using the Scanner class.
 */
public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close(); // Always close the Scanner when done
    }
}
