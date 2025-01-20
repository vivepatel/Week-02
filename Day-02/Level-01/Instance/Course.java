public class Course {
    // Instance variables
    private String courseName;
    private int duration; // in weeks
    private double fee;

    // Class variable
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        // Setting the institute name
        Course.updateInstituteName("Tech Academy");

        // Creating courses
        Course course1 = new Course("Java Programming", 10, 300.0);
        Course course2 = new Course("Web Development", 12, 400.0);
        Course course3 = new Course("Data Science", 14, 500.0);

        // Displaying course details
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        course2.displayCourseDetails();

        System.out.println("\nCourse 3 Details:");
        course3.displayCourseDetails();

        // Updating the institute name
        Course.updateInstituteName("Advanced Tech Academy");
        System.out.println("\nInstitute Name Updated:");

        // Displaying course details again to reflect the updated institute name
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();
    }
}
