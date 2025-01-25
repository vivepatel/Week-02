package assistedproblem.employeemangementsystem;

// child class
class Developer extends Employee{
    protected String language;
    // callling the constructor
    public Developer(String name, int id, double salary, String role,String language) {
        super(name, id, salary, role);
        this.language=language;
    }
    // display function
    @Override
    public void diplayDetails() {
        super.diplayDetails();
        System.out.println(" The language Used by Developer is " + language );
    }
}
