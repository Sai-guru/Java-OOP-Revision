/*
 * OBJECT
 * An object is a real instance of a class. The `new` expression allocates it,
 * initializes its fields, and returns a reference to it.
 */
public class ObjectExample {
    private final String name;

    ObjectExample(String name) {
        this.name = name;
    }

    void greet() {
        System.out.println("Hello from " + name);
    }

    public static void main(String[] args) {
        ObjectExample firstObject = new ObjectExample("first object");
        ObjectExample secondObject = new ObjectExample("second object");
        firstObject.greet();
        secondObject.greet();
    }
}
