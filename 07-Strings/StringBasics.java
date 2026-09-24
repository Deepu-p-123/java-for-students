/*
 * StringBasics.java
 * Demonstrates creating strings and basic string operations.
 */
public class StringBasics {
    public static void main(String[] args) {
        // Creating strings
        String s1 = "Hello";                 // string literal
        String s2 = new String("World");      // using the new keyword

        // Concatenation
        String greeting = s1 + " " + s2;
        System.out.println("Concatenated: " + greeting);

        // Length
        System.out.println("Length: " + greeting.length());

        // Comparing strings
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println("a == b : " + (a == b));         // true (same string pool reference)
        System.out.println("a == c : " + (a == c));         // false (different object)
        System.out.println("a.equals(c): " + a.equals(c));  // true (same content)

        // Immutability demonstration
        String original = "Hello";
        String modified = original.concat(" Java");
        System.out.println("Original: " + original);   // unchanged
        System.out.println("Modified: " + modified);
    }
}
