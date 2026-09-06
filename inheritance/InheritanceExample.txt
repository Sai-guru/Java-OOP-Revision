/*
 * INHERITANCE
 * A child class reuses and extends the accessible members of a parent class.
 * `extends` expresses an "is-a" relationship.
 */
public class InheritanceExample {
    static class Animal {
        void eat() {
            System.out.println("Animal eats.");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks.");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // inherited method
        dog.bark(); // child-specific method
    }
}
