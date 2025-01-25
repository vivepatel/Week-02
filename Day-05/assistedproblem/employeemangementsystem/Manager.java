package assistedproblem.employeemangementsystem;

// child class
class Manager extends Employee{
    protected int size;
    //created the constructor of Manger

    public Manager(String name, int id, double salary, String role , int size) {
        super(name, id, salary, role);
        this.size=size;
    }

    // display function overiding
    @Override
    public void diplayDetails() {
        super.diplayDetails();
        System.out.println(" The team Size is " + size);
    }
}