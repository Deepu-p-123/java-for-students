/*
 * Polymorphism.java
 * Demonstrates both compile-time (method overloading) and
 * run-time (method overriding) polymorphism.
 */

// Run-time polymorphism (method overriding)
class Shape {
    double area() {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class Polymorphism {

    // Compile-time polymorphism (method overloading) - same method name, different parameters
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Method overloading demo
        System.out.println("add(2, 3) = " + add(2, 3));
        System.out.println("add(2.5, 3.5) = " + add(2.5, 3.5));
        System.out.println("add(1, 2, 3) = " + add(1, 2, 3));

        // Method overriding demo (run-time polymorphism)
        Shape[] shapes = { new Circle(5), new Rectangle(4, 6) };
        for (Shape shape : shapes) {
            // The correct area() method is chosen at run-time based on actual object type
            System.out.println("Area: " + shape.area());
        }
    }
}
