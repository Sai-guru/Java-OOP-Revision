/*
 * SETTER
 * A setter changes private state. It can validate input before changing the
 * field, preventing invalid objects.
 */
public class SetterExample {
    private int age;

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        SetterExample person = new SetterExample();
        person.setAge(30);
        System.out.println(person.getAge());
    }
}
