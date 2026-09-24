/*
 * Constructor.java
 * Demonstrates default, parameterized, and copy constructors,
 * as well as constructor overloading.
 */
class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;   // 'this' refers to the current object's field
        this.author = author;
        this.price = price;
    }

    // Copy constructor
    Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    void display() {
        System.out.println(title + " by " + author + " - $" + price);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Book b1 = new Book(); // uses default constructor
        b1.display();

        Book b2 = new Book("Java Basics", "John Doe", 29.99); // parameterized
        b2.display();

        Book b3 = new Book(b2); // copy constructor
        b3.display();
    }
}
