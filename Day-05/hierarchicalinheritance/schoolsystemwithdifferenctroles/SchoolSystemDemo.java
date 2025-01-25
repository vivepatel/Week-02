package hierarchicalinheritance.schoolsystemwithdifferenctroles;

// Main Class to Demonstrate Hierarchical Inheritance
public class SchoolSystemDemo {
    public static void main(String[] args) {
        System.out.println("Teacher:");
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        teacher.displayDetails();
        teacher.displayRole();

        System.out.println("\nStudent:");
        Student student = new Student("Bob", 16, "10th Grade");
        student.displayDetails();
        student.displayRole();

        System.out.println("\nStaff:");
        Staff staff = new Staff("Charlie", 40, "Administration");
        staff.displayDetails();
        staff.displayRole();
    }
}