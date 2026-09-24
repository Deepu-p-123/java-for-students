# 11-JDBC — Connecting Java to a Database

This module teaches students how to connect a Java program to a MySQL
database using JDBC (Java Database Connectivity).

## Setup Steps

1. **Install MySQL Server** (or use XAMPP/MAMP which bundles it).

2. **Download the MySQL Connector/J driver** (the JDBC driver JAR):
   https://dev.mysql.com/downloads/connector/j/

3. **Add the driver to your classpath.**
   - In an IDE (IntelliJ/Eclipse): add the `.jar` as a project library.
   - From the command line:
     ```
     javac -cp .:mysql-connector-j-8.x.x.jar SelectRecords.java
     java  -cp .:mysql-connector-j-8.x.x.jar SelectRecords
     ```
     (On Windows, replace `:` with `;`.)

4. **Create the database and table:**
   ```sql
   CREATE DATABASE student_db;
   USE student_db;

   CREATE TABLE students (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(100),
       age INT,
       course VARCHAR(50)
   );
   ```

5. **Update credentials** in each `.java` file (`URL`, `USER`, `PASSWORD`)
   to match your local MySQL setup.

## Recommended Teaching Order

1. `JdbcConnectionDemo.java` — establishing a connection
2. `InsertRecord.java` — adding data (INSERT)
3. `SelectRecords.java` — reading data (SELECT)
4. `UpdateDeleteRecord.java` — modifying/removing data (UPDATE/DELETE)

## Bonus: Combining GUI + JDBC

Once students are comfortable with both modules 10-GUI and 11-JDBC,
a great capstone exercise is to rebuild `LoginFormGUI.java` from
10-GUI so it checks credentials against a real `users` table in the
database instead of a hardcoded username/password.
