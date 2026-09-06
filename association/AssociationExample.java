/*
 * ASSOCIATION
 * Association means two independent objects know about or use each other.
 * Neither object owns the lifetime of the other.
 */
public class AssociationExample {
    static class Student {
        void learnFrom(Teacher teacher) {
            System.out.println("Student learns from " + teacher.name);
        }
    }

    static class Teacher {
        private final String name;

        Teacher(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher("Ravi");
        student.learnFrom(teacher);
    }
}
