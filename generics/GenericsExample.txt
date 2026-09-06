/*
 * GENERICS
 * Generics make a type reusable while preserving compile-time type safety.
 * The compiler prevents adding the wrong kind of value to a generic container.
 */
import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    static class Box<T> {
        private T value;

        void put(T value) {
            this.value = value;
        }

        T get() {
            return value;
        }
    }

    public static void main(String[] args) {
        Box<String> textBox = new Box<>();
        textBox.put("Java");
        System.out.println(textBox.get());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);
    }
}
