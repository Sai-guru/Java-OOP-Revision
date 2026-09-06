/*
 * INTERFACE
 * An interface is a contract. A class uses `implements` and must implement its
 * abstract methods. One class can implement multiple interfaces.
 */
public class InterfaceExample {
    interface Printable {
        void print();
    }

    interface Scannable {
        void scan();
    }

    static class Machine implements Printable, Scannable {
        public void print() {
            System.out.println("Printing document.");
        }

        public void scan() {
            System.out.println("Scanning document.");
        }
    }

    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.print();
        machine.scan();
    }
}
