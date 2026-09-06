/*
 * ABSTRACTION
 * An abstract class exposes what an object must do while hiding how it does it.
 * It may contain both abstract (unfinished) and concrete methods.
 */
public class AbstractionExample {
    static abstract class Payment {
        abstract void pay(double amount);

        void receipt() {
            System.out.println("Receipt generated.");
        }
    }

    static class CardPayment extends Payment {
        @Override
        void pay(double amount) {
            System.out.println("Paid " + amount + " using a card.");
        }
    }

    public static void main(String[] args) {
        Payment payment = new CardPayment();
        payment.pay(250.0);
        payment.receipt();
    }
}
