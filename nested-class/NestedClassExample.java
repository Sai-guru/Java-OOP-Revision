/*
 * NESTED CLASSES
 * A static nested class belongs to the outer class. An inner class is tied to
 * an outer object. Nesting is useful when a helper type belongs to one concept.
 */
public class NestedClassExample {
    private String outerMessage = "Message from outer object";

    static class StaticNested {
        void print() {
            System.out.println("Static nested class needs no outer object.");
        }
    }

    class Inner {
        void print() {
            System.out.println(outerMessage);
        }
    }

    public static void main(String[] args) {
        new StaticNested().print();
        NestedClassExample outer = new NestedClassExample();
        outer.new Inner().print();
    }
}
