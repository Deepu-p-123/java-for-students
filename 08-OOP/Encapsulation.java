/*
 * Encapsulation.java
 * Demonstrates encapsulation: keeping fields private and exposing
 * controlled access through public getter/setter methods.
 */
class BankAccount {
    private String accountHolder;
    private double balance; // private fields cannot be accessed directly from outside

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter with validation logic - this is the benefit of encapsulation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Anita Sharma", 1000.0);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500);
        account.withdraw(200);
        account.withdraw(5000); // will fail validation

        System.out.println("Final Balance: " + account.getBalance());

        // account.balance = -9999; // This would NOT compile - balance is private!
    }
}
