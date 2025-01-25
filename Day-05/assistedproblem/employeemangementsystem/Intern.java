package assistedproblem.employeemangementsystem;

// Child class
class Intern extends Employee{


    protected String Collage;
    // created the constrctor

    public Intern(String name, int id, double salary, String role , String Collage) {
        super(name, id, salary, role);
        this.Collage=Collage;
    }
    // diplay funciton
    @Override
    public void diplayDetails() {
        super.diplayDetails();
        System.out.println(" Colloge is "+Collage);
    }
}
