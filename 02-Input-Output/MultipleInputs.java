import java.util.Scanner;

/*
 * MultipleInputs.java
 * Demonstrates reading multiple different data types in one program,
 * and the common pitfall of mixing nextInt()/nextDouble() with nextLine().
 */
public class MultipleInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your roll number (int): ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline character

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your CGPA (double): ");
        double cgpa = scanner.nextDouble();

        System.out.print("Are you a topper? (true/false): ");
        boolean isTopper = scanner.nextBoolean();

        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + fullName);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Topper: " + isTopper);

        scanner.close();
    }
}
