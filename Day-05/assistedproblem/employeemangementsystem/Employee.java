package assistedproblem.employeemangementsystem;

// Parent Class
class Employee{
    protected String name;
    protected int id;
    protected double salary;
    protected String role;
    // creating the Constructor of Employee Class
    public Employee(String name, int id, double salary ,String role) {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.role=role;
    }

    // displaying the Details
    public void diplayDetails()
    {
        System.out.print(" Name "+ name +" Id " + id + " Salary " + salary + " Role "+ role);
    }

}

