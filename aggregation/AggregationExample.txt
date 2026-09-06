/*
 * AGGREGATION
 * Aggregation is a weaker "has-a" relationship. The contained object can
 * exist independently and may be shared by multiple owners.
 */
public class AggregationExample {
    static class Teacher {
        private final String name;

        Teacher(String name) {
            this.name = name;
        }
    }

    static class Department {
        private final Teacher teacher;

        Department(Teacher teacher) {
            this.teacher = teacher;
        }

        void showTeacher() {
            System.out.println("Department teacher: " + teacher.name);
        }
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Anita");
        new Department(teacher).showTeacher();
        System.out.println("The teacher can still exist independently.");
    }
}
