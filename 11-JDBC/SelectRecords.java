import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * SelectRecords.java
 * Demonstrates querying data from a database table and processing
 * the results using a ResultSet.
 */
public class SelectRecords {
    static final String URL = "jdbc:mysql://localhost:3306/student_db";
    static final String USER = "root";
    static final String PASSWORD = "your_password"; // replace with your actual password

    public static void main(String[] args) {
        String sql = "SELECT id, name, age, course FROM students WHERE age > ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, 18); // only students older than 18

            try (ResultSet rs = stmt.executeQuery()) {
                System.out.println("ID\tName\t\tAge\tCourse");
                System.out.println("---------------------------------------------");
                while (rs.next()) { // move to the next row; returns false when no more rows
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    String course = rs.getString("course");

                    System.out.println(id + "\t" + name + "\t\t" + age + "\t" + course);
                }
            }

        } catch (SQLException e) {
            System.out.println("Failed to retrieve records.");
            e.printStackTrace();
        }
    }
}

/*  javac SelectRecords.java
   java -cp ".;mysql-connector-j-26.7.0.jar" SelectRecords

   */