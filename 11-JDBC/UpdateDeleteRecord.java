import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * UpdateDeleteRecord.java
 * Demonstrates updating and deleting records using PreparedStatement.
 */
public class UpdateDeleteRecord {
    static final String URL = "jdbc:mysql://localhost:3306/student_db";
    static final String USER = "root";
    static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        updateStudentCourse(1, "Data Science");
        deleteStudentById(5);
    }

    // Update example
    static void updateStudentCourse(int studentId, String newCourse) {
        String sql = "UPDATE students SET course = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, newCourse);
            stmt.setInt(2, studentId);

            int rowsUpdated = stmt.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");

        } catch (SQLException e) {
            System.out.println("Failed to update record.");
            e.printStackTrace();
        }
    }

    // Delete example
    static void deleteStudentById(int studentId) {
        String sql = "DELETE FROM students WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, studentId);

            int rowsDeleted = stmt.executeUpdate();
            System.out.println(rowsDeleted + " row(s) deleted.");

        } catch (SQLException e) {
            System.out.println("Failed to delete record.");
            e.printStackTrace();
        }
    }
}
