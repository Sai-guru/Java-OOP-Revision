/*
 * GETTER
 * A getter is a method that reads private state. Keeping fields private gives
 * the class control over how its data is exposed.
 */
public class GetterExample {
    private final String username;

    GetterExample(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public static void main(String[] args) {
        GetterExample user = new GetterExample("alex");
        System.out.println(user.getUsername());
    }
}
