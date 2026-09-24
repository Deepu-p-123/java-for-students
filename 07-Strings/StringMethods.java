/*
 * StringMethods.java
 * Demonstrates commonly used String class methods.
 */
public class StringMethods {
    public static void main(String[] args) {
        String text = "  Java Programming is Fun  ";

        System.out.println("Original: [" + text + "]");
        System.out.println("Trimmed: [" + text.trim() + "]");
        System.out.println("Upper Case: " + text.toUpperCase());
        System.out.println("Lower Case: " + text.toLowerCase());

        String clean = text.trim();
        System.out.println("Contains 'Fun': " + clean.contains("Fun"));
        System.out.println("Starts with 'Java': " + clean.startsWith("Java"));
        System.out.println("Ends with 'Fun': " + clean.endsWith("Fun"));
        System.out.println("Index of 'Programming': " + clean.indexOf("Programming"));
        System.out.println("Substring(0, 4): " + clean.substring(0, 4));
        System.out.println("Replace 'Fun' with 'Awesome': " + clean.replace("Fun", "Awesome"));

        // Splitting a string
        String[] words = clean.split(" ");
        System.out.println("\nSplit into words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Joining strings
        String joined = String.join("-", words);
        System.out.println("\nJoined with '-': " + joined);

        // Character access
        System.out.println("\nCharacter at index 0: " + clean.charAt(0));

        // Checking equality ignoring case
        System.out.println("Equals ignore case: " + "JAVA".equalsIgnoreCase("java"));
    }
}
