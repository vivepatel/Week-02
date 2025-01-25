package hierarchicalinheritance.schoolsystemwithdifferenctroles;

// Subclass: Teacher
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Teaches: " + subject);
    }
}
