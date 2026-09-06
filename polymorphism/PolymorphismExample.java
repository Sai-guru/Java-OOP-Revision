/*
 * POLYMORPHISM
 * "One reference, many forms": a parent reference can point to different
 * child objects. The actual object's overridden method is selected at runtime.
 */
public class PolymorphismExample {
    interface Shape {
        void draw();
    }

    static class Circle implements Shape {
        public void draw() {
            System.out.println("Drawing a circle.");
        }
    }

    static class Square implements Shape {
        public void draw() {
            System.out.println("Drawing a square.");
        }
    }

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape = new Square();
        shape.draw();
    }
}
