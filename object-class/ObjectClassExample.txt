/*
 * OBJECT CLASS
 * Every Java class implicitly extends java.lang.Object. Common inherited
 * methods include toString(), equals(), and hashCode(). Override them when
 * objects need value-based behavior.
 */
public class ObjectClassExample {
    private final int id;

    ObjectClassExample(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ObjectClassExample{id=" + id + "}";
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ObjectClassExample)) {
            return false;
        }
        ObjectClassExample that = (ObjectClassExample) other;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    public static void main(String[] args) {
        ObjectClassExample first = new ObjectClassExample(7);
        ObjectClassExample second = new ObjectClassExample(7);
        System.out.println(first);
        System.out.println(first.equals(second));
    }
}
