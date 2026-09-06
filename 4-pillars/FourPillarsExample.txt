/*
 * THE FOUR PILLARS OF OOP
 * 1. Encapsulation: private fields plus controlled methods.
 * 2. Inheritance: PremiumAccount extends Account.
 * 3. Polymorphism: Account reference invokes PremiumAccount's implementation.
 * 4. Abstraction: abstract Account defines the common contract.
 */
public class FourPillarsExample {
    static abstract class Account {
        private final String owner; // encapsulation

        Account(String owner) {
            this.owner = owner;
        }

        public String getOwner() {
            return owner;
        }

        abstract double yearlyBenefit(); // abstraction
    }

    static class PremiumAccount extends Account { // inheritance
        PremiumAccount(String owner) {
            super(owner);
        }

        @Override
        double yearlyBenefit() {
            return 120.0;
        }
    }

    public static void main(String[] args) {
        Account account = new PremiumAccount("Ravi"); // polymorphism
        System.out.println(account.getOwner() + " receives " + account.yearlyBenefit());
    }
}
