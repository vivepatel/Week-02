// Base class: Employee
class Employee {
    // Public member
    public final int employeeID;

    // Protected member
    protected String department;

    // Private member
    private double salary;

    static String companyname;

    static int count=0;
    // Constructor
    public Employee(int employeeID, String department, double salary, String companyname) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
        this.companyname=companyname;
        count++;
    }

    // Public method to modify the salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    public static int displayTotalEmployees(){
        return count;
    }
    // Method to display employee details
    public void displayEmployeeDetails() {
        if(this instanceof Employee) {
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Department: " + department);
            System.out.println("Salary: $" + salary);
            System.out.println("Compnay name: " + companyname);
        }
        else{
            System.out.println("object is not valid");
        }
    }
}

// Subclass: Manager
class Manager extends Employee {
    private String teamSize; // Additional attribute for Manager

    // Constructor for Manager
    public Manager(int employeeID, String department, double salary, String teamSize) {
        super(employeeID, department, salary,companyname); // Call the superclass constructor
        this.teamSize = teamSize;
    }

    // Method to display Manager details
    public void displayManagerDetails() {
        // Accessing the public member `employeeID` from the base class
        System.out.println("Employee ID: " + employeeID);  // Accessing public member `employeeID`
        System.out.println("Department: " + department); // Accessing protected member `department`
        System.out.println("Salary: $" + getSalary()); // Access private `salary` via getter method
        System.out.println("Team Size: " + teamSize);
    }
}

// Main class
public class CompanyManagementSystem {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee1 = new Employee(101, "Marketing", 50000.00,"capgemini");
        System.out.println("Employee Details:");
        employee1.displayEmployeeDetails();

        // Modifying salary using setter
        employee1.setSalary(55000.00);
        System.out.println("\nUpdated Employee Details:");
        employee1.displayEmployeeDetails();

        // Creating a Manager object
        Manager manager1 = new Manager(102, "Sales", 80000.00, "10");
        System.out.println("\nManager Details:");
        manager1.displayManagerDetails();

        System.out.println("Total numbers of employee :"+ Employee.displayTotalEmployees());
    }
}
