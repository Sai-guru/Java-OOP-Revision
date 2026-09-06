/*
 * SUPER KEYWORD
 * `super` refers to the immediate parent class. It can call a parent
 * constructor, access a parent field, or invoke a parent method.
 */
public class SuperKeywordExample {
    static class Parent {
        protected String message = "Message from parent";

        Parent(String name) {
            System.out.println("Parent constructor: " + name);
        }

        void print() {
            System.out.println(message);
        }
    }

    static class Child extends Parent {
        Child() {
            super("Child"); // call the parent constructor
        }

        @Override
        void print() {
            super.print(); // call the parent implementation
            System.out.println("Child adds its own behavior.");
        }
    }

    public static void main(String[] args) {
        new Child().print();
    }
}
