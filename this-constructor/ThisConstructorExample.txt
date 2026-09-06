/*
 * THIS()
 * `this(...)` calls another constructor in the same class. It must be the
 * first statement, and it avoids repeating initialization logic.
 */
public class ThisConstructorExample {
    private final String name;
    private final int level;

    ThisConstructorExample() {
        this("Guest", 1);
    }

    ThisConstructorExample(String name) {
        this(name, 1);
    }

    ThisConstructorExample(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public static void main(String[] args) {
        System.out.println(new ThisConstructorExample().name);
        System.out.println(new ThisConstructorExample("Admin", 5).level);
    }
}
