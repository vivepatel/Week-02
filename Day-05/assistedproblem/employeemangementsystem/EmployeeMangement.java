package assistedproblem.employeemangementsystem;
// main class
public class EmployeeMangement {

    // main method
    public static void main(String[] args) {
        // creating the Object employee with the refernce of Employee and Object Of Manager

        Employee employee = new Manager("Vivek" , 188,25000.00 ,"Manager" , 50);
        //calling the DiplayDetaild method
        employee.diplayDetails();
        // creating the Object employee1 with the refernce of Employee and Object Of Developer
        Employee employee1= new Developer("Mayank" ,122 ,5000.00 , "Developer" ,"Java" );
        //calling the DiplayDetaild method
        employee1.diplayDetails();
        // creating the Object employee2 with the refernce of Employee and Object Of Intern
        Employee employee2= new Intern("Anubav",34,500.00,"Intern","TechnoCrates");
        //calling the DiplayDetaild method
        employee2.diplayDetails();


    }
}
