/*
 * EXCEPTION HANDLING
 * Exceptions represent problems during execution. `try` contains risky code,
 * `catch` handles a known problem, and `finally` runs whether it succeeds or
 * fails. Do not silently ignore exceptions.
 */
public class ExceptionHandlingExample {
    static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        } catch (IllegalArgumentException exception) {
            System.out.println("Handled error: " + exception.getMessage());
        } finally {
            System.out.println("Division attempt finished.");
        }
    }
}
