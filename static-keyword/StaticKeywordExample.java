/*
 * STATIC KEYWORD
 * A static member belongs to the class, not to an individual object. There is
 * one shared copy, and it can be accessed through the class name.
 */
public class StaticKeywordExample {
    private static int objectCount;
    private final int id;

    StaticKeywordExample() {
        id = ++objectCount;
    }

    static void printCount() {
        System.out.println("Objects created: " + objectCount);
    }

    void printId() {
        System.out.println("Object id: " + id);
    }

    public static void main(String[] args) {
        StaticKeywordExample first = new StaticKeywordExample();
        StaticKeywordExample second = new StaticKeywordExample();
        first.printId();
        second.printId();
        StaticKeywordExample.printCount();
    }
}
