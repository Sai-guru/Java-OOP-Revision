/*
 * CLASS
 * A class is a blueprint. It defines the data (fields) and behavior (methods)
 * that objects created from the blueprint will have.
 */
public class ClassExample {
    String model;
    int wheels;

    void describe() {
        System.out.println(model + " has " + wheels + " wheels.");
    }

    public static void main(String[] args) {
        System.out.println("ClassExample describes the blueprint; an object is created elsewhere.");
    }
}
