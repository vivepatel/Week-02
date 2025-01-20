// Base class: Student
class Student {
    // Public member
    public int rollNumber;

    // Protected member
    protected String name;

    // Private member
    private double CGPA;

    static String universityName;

    static int count=0;

    // Constructor
    public Student(int rollNumber, String name, double CGPA,String universityName) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
        this.universityName= universityName;
        count++;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA! It must be between 0.0 and 10.0.");
        }
    }
    static int  displayTotalStudents(){
        return count;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA,universityName); // Call the superclass constructor
        this.specialization = specialization;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        // Accessing the protected member `name` from the base class
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); // Protected member can be accessed in subclass
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCGPA()); // Access private member through public method
    }
}

// Main class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating a base class Student object
        Student student1 = new Student(101, "Alice", 8.5,"TIT");
        System.out.println("Student Details:");
        student1.displayStudentDetails();

        // Modifying CGPA using setter
        student1.setCGPA(9.0);
        System.out.println("\nUpdated Student Details:");
        student1.displayStudentDetails();

        // Creating a subclass PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 9.2, "Data Science");
        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayPostgraduateDetails();

        System.out.println("Total number of student: "+ Student.displayTotalStudents());
    }
}
