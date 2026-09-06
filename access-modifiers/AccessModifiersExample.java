/*
 * ACCESS MODIFIERS
 * public: accessible everywhere.
 * protected: accessible in the same package and by subclasses.
 * default (no keyword): accessible only in the same package.
 * private: accessible only inside its declaring class.
 *
 * This single-file example shows declarations; package-level access is easiest
 * to observe by placing related classes in the same package.
 */
public class AccessModifiersExample {
    public String publicValue = "public";
    protected String protectedValue = "protected";
    String packageValue = "default/package-private";
    private String privateValue = "private";

    public String readPrivateValue() {
        return privateValue; // private data is accessed through a method
    }

    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();
        System.out.println(example.publicValue);
        System.out.println(example.protectedValue);
        System.out.println(example.packageValue);
        System.out.println(example.readPrivateValue());
    }
}
