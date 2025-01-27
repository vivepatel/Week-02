package encapsulationandpolymorphism.employeemanagementsystem;

// PartTimeEmployee class
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0); // Base salary is calculated dynamically for part-time employees
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate; // Salary based on hours worked
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}
