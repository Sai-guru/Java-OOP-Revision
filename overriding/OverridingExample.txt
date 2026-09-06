/*
 * METHOD OVERRIDING
 * A child supplies a new implementation of an inherited method with the same
 * signature. `@Override` asks the compiler to verify that relationship.
 */
public class OverridingExample {
    static class Notification {
        void send() {
            System.out.println("Sending a generic notification.");
        }
    }

    static class EmailNotification extends Notification {
        @Override
        void send() {
            System.out.println("Sending an email.");
        }
    }

    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        notification.send(); // runtime dispatch selects EmailNotification.send
    }
}
