/*
 * ClassAndObject.java
 * Demonstrates defining a class with fields and methods, and
 * creating multiple objects (instances) of that class.
 */
class Student {
    // Fields (instance variables)
    String name;
    int rollNumber;
    double cgpa;

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("CGPA: " + cgpa);
        System.out.println("-------------------------");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        // Creating first object
        Student student1 = new Student();
        student1.name = "Ravi Kumar";
        student1.rollNumber = 101;
        student1.cgpa = 8.7;

        // Creating second object
        Student student2 = new Student();
        student2.name = "Priya Nair";
        student2.rollNumber = 102;
        student2.cgpa = 9.2;

        // Each object has its own copy of the fields
        student1.displayInfo();
        student2.displayInfo();
    }
}
