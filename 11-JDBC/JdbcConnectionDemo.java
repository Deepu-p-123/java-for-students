import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * JdbcConnectionDemo.java
 * Demonstrates establishing a connection to a MySQL database using JDBC.
 *
 * PREREQUISITES (see README.md in this folder for full setup steps):
 *  1. A running MySQL server with a database named "student_db".
 *  2. The MySQL Connector/J driver JAR added to your classpath.
 *
 * Update the URL, username, and password below to match your setup.
 */
public class JdbcConnectionDemo {

    // JDBC connection details
    static final String URL = "jdbc:mysql://localhost:3306/student_db";
    static final String USER = "root";
    static final String PASSWORD = "your_password"; // replace with your actual password

    public static void main(String[] args) {
        // try-with-resources automatically closes the connection when done
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Connected to the database successfully!");
            System.out.println("Connection details: " + connection.getMetaData().getURL());
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
    }
}


/*   javac JdbcConnectionDemo.java
   java -cp ".;mysql-connector-j-26.7.0.jar" JdbcConnectionDemo

   */
