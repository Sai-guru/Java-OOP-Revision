/*
 * NEW KEYWORD
 * `new` creates an object and returns a reference to it. The constructor then
 * initializes that object. Objects normally live on the heap.
 */
public class NewKeywordExample {
    private final String message;

    NewKeywordExample(String message) {
        this.message = message;
    }

    void print() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        NewKeywordExample example = new NewKeywordExample("Created with new.");
        example.print();
        int[] numbers = new int[3]; // new also creates arrays
        System.out.println("Array length: " + numbers.length);
    }
}
