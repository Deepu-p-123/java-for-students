/*
 * Abstraction.java
 * Demonstrates abstraction using an abstract class and an interface.
 * Abstraction hides implementation details and exposes only essential behavior.
 */

// Abstract class - cannot be instantiated directly, may have both
// abstract methods (no body) and concrete methods (with body).
abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void startEngine(); // must be implemented by subclasses

    void displayBrand() { // concrete method shared by all subclasses
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    @Override
    void startEngine() {
        System.out.println(brand + " car engine started with a key/button.");
    }
}

// Interface - a fully abstract contract (Java 8+ allows default/static methods too)
interface Payable {
    double calculateTax(); // implicitly public and abstract

    default void printReceipt() {
        System.out.println("Tax to be paid: " + calculateTax());
    }
}

class Invoice implements Payable {
    double amount;

    Invoice(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculateTax() {
        return amount * 0.18; // 18% tax
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota");
        myCar.displayBrand();
        myCar.startEngine();

        Invoice invoice = new Invoice(1000.0);
        invoice.printReceipt(); // uses the default method from the interface
    }
}
