/*
 * THIS KEYWORD
 * `this` refers to the current object. It removes ambiguity when a parameter
 * has the same name as a field and can call another instance method.
 */
public class ThisKeywordExample {
    private String title;

    ThisKeywordExample(String title) {
        this.title = title;
    }

    void show() {
        this.printTitle();
    }

    private void printTitle() {
        System.out.println(this.title);
    }

    public static void main(String[] args) {
        new ThisKeywordExample("Using this").show();
    }
}
