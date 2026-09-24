import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * InsertRecord.java
 * Takes student details from the user (using a switch-based menu)
 * and inserts them into the database with a PreparedStatement.
 *
 * Expected table schema:
 *   CREATE TABLE students (
 *       id INT AUTO_INCREMENT PRIMARY KEY,
 *       name VARCHAR(100),
 *       age INT,
 *       course VARCHAR(50)
 *   );
 */
public class InsertRecord {
    static final String URL = "jdbc:mysql://localhost:3306/student_db";
    static final String USER = "root";
    static final String PASSWORD = "your_password"; // replace with your actual password

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== Student Menu =====");
            System.out.println("1. Add a new student");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    addStudent(sc);
                    break;
                case "2":
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
        sc.close();
    }

    // Reads details from the user and inserts them into the table
    static void addStudent(Scanner sc) {
        System.out.print("Enter name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter age: ");
        int age;
        try {
            age = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Age must be a number. Record not added.");
            return;
        }

        String course = chooseCourse(sc);
        if (course == null) {
            System.out.println("Invalid course choice. Record not added.");
            return;
        }

        String sql = "INSERT INTO students (name, age, course) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            // Parameter index starts at 1, not 0
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, course);

            int rowsInserted = stmt.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted successfully.");

        } catch (SQLException e) {
            System.out.println("Failed to insert record.");
            e.printStackTrace();
        }
    }

    // Uses a switch to turn the user's menu choice into a course name
    static String chooseCourse(Scanner sc) {
        System.out.println("Select course:");
        System.out.println("1. Computer Science");
        System.out.println("2. Electronics");
        System.out.println("3. Mechanical");
        System.out.println("4. Civil");
        System.out.print("Enter choice: ");
        String choice = sc.nextLine().trim();

        switch (choice) {
            case "1":
                return "Computer Science";
            case "2":
                return "Electronics";
            case "3":
                return "Mechanical";
            case "4":
                return "Civil";
            default:
                return null;   // invalid choice
        }
    }
}

/*  javac InsertRecord.java
    java -cp ".;mysql-connector-j-26.7.0.jar" InsertRecord
*/