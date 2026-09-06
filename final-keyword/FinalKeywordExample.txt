/*
 * FINAL KEYWORD
 * A final variable can be assigned only once, a final method cannot be
 * overridden, and a final class cannot be extended.
 */
public class FinalKeywordExample {
    static final double TAX_RATE = 0.18;

    static final class Utility {
        static void print() {
            System.out.println("This class cannot have a child class.");
        }
    }

    static class Parent {
        final void importantRule() {
            System.out.println("This method cannot be overridden.");
        }
    }

    public static void main(String[] args) {
        final int quantity = 2;
        System.out.println(quantity + " items, tax rate: " + TAX_RATE);
        Utility.print();
        new Parent().importantRule();
    }
}
