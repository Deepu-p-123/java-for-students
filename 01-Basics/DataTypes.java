/*
 * DataTypes.java
 * Demonstrates Java's primitive data types and their ranges/usage.
 */
public class DataTypes {
    public static void main(String[] args) {
        byte byteVar = 10;
        short shortVar = 1000;
        int intVar = 100000;
        long longVar = 10000000000L; // 'L' suffix required for long literals

        float floatVar = 5.75f; // 'f' suffix required for float literals
        double doubleVar = 19.99;

        char charVar = 'J';
        boolean boolVar = true;

        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);

        System.out.println("Max int value: " + Integer.MAX_VALUE);
        System.out.println("Min int value: " + Integer.MIN_VALUE);
    }
}
