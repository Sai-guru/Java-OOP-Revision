/*
 * COMPOSITION
 * Composition is a strong "has-a" relationship. The owner creates and controls
 * the part; when the owner is gone, the part has no independent purpose.
 */
public class CompositionExample {
    static class Engine {
        void start() {
            System.out.println("Engine started.");
        }
    }

    static class Car {
        private final Engine engine = new Engine();

        void start() {
            engine.start();
            System.out.println("Car started.");
        }
    }

    public static void main(String[] args) {
        new Car().start();
    }
}
