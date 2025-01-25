package multilevelinheritance.educationalcoursehierarchy;

// Main Class to Demonstrate Inheritance
public class CourseHierarchyDemo {
    public static void main(String[] args) {
        System.out.println("Base Class: Course");
        Course course = new Course("Java Programming", 30);
        course.displayDetails();

        System.out.println("\nSubclass: OnlineCourse");
        OnlineCourse onlineCourse = new OnlineCourse("Python Programming", 40, "Udemy", true);
        onlineCourse.displayDetails();

        System.out.println("\nSubclass: PaidOnlineCourse");
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Machine Learning", 50, "Coursera", true, 200.0, 20.0);
        paidCourse.displayDetails();
    }
}
