package encapsulationandpolymorphism.employeemanagementsystem;

// FullTimeEmployee class
class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Fixed monthly salary for full-time employees
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
