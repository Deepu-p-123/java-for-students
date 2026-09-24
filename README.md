# Java for Students 🎓

A structured, beginner-to-intermediate Java course designed for classroom
teaching. Each folder is a self-contained topic with small, runnable, and
heavily commented `.java` files. Students can compile and run each file
independently.

## 📁 Repository Structure

```
java-for-students/
│
├── 01-Basics/                  Hello World, variables, data types, comments
├── 02-Input-Output/            Reading user input with Scanner
├── 03-Operators/               Arithmetic, relational, logical, assignment operators
├── 04-Conditional-Statements/  if-else, nested if, switch
├── 05-Loops/                   for, while, do-while
├── 06-Arrays/                  1D and 2D arrays
├── 07-Strings/                 String basics and String class methods
├── 08-OOP/                     Classes, constructors, encapsulation,
│                               inheritance, polymorphism, abstraction
├── 09-Exception-Handling/      try-catch, finally, custom exceptions
├── 10-GUI/                     Desktop GUIs with Java Swing
└── 11-JDBC/                    Connecting Java programs to a MySQL database
```

## ✅ Prerequisites

- **JDK 17+** installed (`java -version` / `javac -version` to check).
- A code editor or IDE: VS Code, IntelliJ IDEA, or Eclipse all work well.
- For **11-JDBC** only:
  - **MySQL Server** and **MySQL Workbench**
    (https://dev.mysql.com/downloads/)
  - **MySQL Connector/J** driver JAR. It is *not* included in this
    repository. Download it from
    https://dev.mysql.com/downloads/connector/j/
    (choose "Platform Independent", extract the ZIP, and copy the
    `mysql-connector-j-x.x.x.jar` file into the `11-JDBC` folder).

## ▶️ How to Compile and Run Any File

From inside the relevant folder:

```bash
javac FileName.java
java FileName
```

Example:

```bash
cd 01-Basics
javac HelloWorld.java
java HelloWorld
```

GUI programs (folder `10-GUI`) open a desktop window. Run them from a
local machine or an IDE, not a headless server.

## 🗄️ Running the JDBC Programs (11-JDBC)

JDBC programs need the MySQL driver JAR on the **classpath**. The `-cp`
option tells Java where to find it.

**Windows:**

```bash
javac InsertRecord.java
java -cp ".;mysql-connector-j-x.x.x.jar" InsertRecord
```

**Mac / Linux:**

```bash
javac InsertRecord.java
java -cp ".:mysql-connector-j-x.x.x.jar" InsertRecord
```

Replace `x.x.x` with the version you downloaded. If you see
`No suitable driver found`, the JAR is missing from the classpath.

**Before running:**

1. Create the database in MySQL Workbench: `CREATE DATABASE student_db;`
2. Open the `.java` file and change `your_password` to your own MySQL
   root password.
3. Never commit your real password to GitHub.

## 📚 Suggested Teaching Order

1. Basics → Input/Output → Operators
2. Conditional Statements → Loops
3. Arrays → Strings
4. Object-Oriented Programming (the biggest and most important module)
5. Exception Handling
6. GUI Programming with Swing
7. Database connectivity with JDBC (capstone: combine GUI + JDBC, e.g.
   turn `LoginFormGUI.java` into a real database-backed login screen)

## 🧑‍🏫 Notes for Instructors

- Every file is self-contained with a single `public class` matching its
  filename, so students can compile and run files independently without a
  build tool.
- Comments explain *why*, not just *what*, to reinforce concepts during
  live coding sessions.
- Feel free to fork this repo per batch and add exercises or assignments
  under a new `exercises/` folder per topic.

## 📄 License

The source code in this repository is released under the MIT License.
See the [LICENSE](LICENSE) file. Third-party software such as MySQL
Connector/J is not included and is subject to its own license.