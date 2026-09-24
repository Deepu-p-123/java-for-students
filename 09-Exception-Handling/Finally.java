/*
 * Finally.java
 * Demonstrates the finally block (always executes, whether or not an
 * exception occurs), and custom (user-defined) exceptions.
 */

// Custom exception class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class Finally {

    static void withdraw(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Balance: " + balance + ", Requested: " + amount);
        }
        System.out.println("Withdrawal successful. New balance: " + (balance - amount));
    }

    public static void main(String[] args) {
        // finally always runs, even if an exception is thrown
        try {
            int[] data = {1, 2, 3};
            System.out.println(data[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed (cleanup code goes here).");
        }

        // Using a custom checked exception
        try {
            withdraw(1000.0, 1500.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        } finally {
            System.out.println("Transaction attempt finished.\n");
        }

        // try-with-resources also guarantees cleanup, similar in spirit to finally
        System.out.println("Demonstrating try-with-resources with a simple AutoCloseable:");
        try (AutoCloseable resource = () -> System.out.println("Resource closed automatically.")) {
            System.out.println("Using the resource...");
        } catch (Exception e) {
            System.out.println("Error while using resource: " + e.getMessage());
        }
    }
}
