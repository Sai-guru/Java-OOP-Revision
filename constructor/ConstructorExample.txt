/*
 * CONSTRUCTOR
 * A constructor has the same name as its class, has no return type, and runs
 * automatically during object creation. It is commonly used for initialization.
 */
public class ConstructorExample {
    private final String name;
    private final int age;

    ConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        new ConstructorExample("Maya", 22).print();
    }
}
