package encapsulationandpolymorphism.employeemanagementsystem;
import java.util.ArrayList;
import java.util.List;
// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = new ArrayList<>();

        // Adding full-time and part-time employees
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("E001", "Alice Johnson", 50000);
        fullTimeEmployee.assignDepartment("HR");

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("E002", "Bob Smith", 200, 25);
        partTimeEmployee.assignDepartment("IT");

        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        // Processing and displaying employee details
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Salary: " + employee.calculateSalary());
          //  if (employee instanceof Department) {
            //    System.out.println(((Department) employee).getDepartmentDetails());
            //}

            System.out.println();
        }
    }
}
