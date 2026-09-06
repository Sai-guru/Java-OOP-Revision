/*
 * ENCAPSULATION
 * Encapsulation keeps data private and exposes controlled operations.
 * This protects an object's valid state instead of allowing direct changes.
 */
public class EncapsulationExample {
    private double balance;

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive.");
        }
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        EncapsulationExample account = new EncapsulationExample();
        account.deposit(500);
        System.out.println("Balance: " + account.getBalance());
    }
}
