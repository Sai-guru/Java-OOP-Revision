/*
 * METHOD OVERLOADING
 * Multiple methods may share a name when their parameter lists differ
 * (number, type, or order). The compiler chooses the matching version.
 */
public class OverloadingExample {
    static int add(int left, int right) {
        return left + right;
    }

    static double add(double left, double right) {
        return left + right;
    }

    static int add(int first, int second, int third) {
        return first + second + third;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(2.5, 3.5));
        System.out.println(add(1, 2, 3));
    }
}
