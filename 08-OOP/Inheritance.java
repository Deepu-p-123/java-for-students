/*
 * Inheritance.java
 * Demonstrates inheritance using 'extends', method overriding, and 'super'.
 */
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sound() {
        System.out.println(name + " makes a generic animal sound.");
    }
}

// Dog inherits all accessible fields/methods from Animal
class Dog extends Animal {
    Dog(String name) {
        super(name); // calls the parent class constructor
    }

    @Override
    void sound() {
        System.out.println(name + " barks: Woof! Woof!");
    }

    void fetch() {
        System.out.println(name + " fetches the ball.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        dog.eat();    // inherited method from Animal
        dog.sound();  // overridden method
        dog.fetch();  // Dog's own method

        // Upcasting: a Dog IS-A Animal
        Animal genericAnimal = new Animal("Generic Animal");
        genericAnimal.sound();
    }
}
