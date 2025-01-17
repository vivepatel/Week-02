import java.util.Scanner;
// creating the class Student Detials
class StudentDetails{
    String name;


    int rollNumber;
    double  marks;

    // created the contructor
    public StudentDetails(String name, int rollNumber, double marks) {
      this.name=name;
      this.rollNumber=rollNumber;
     this.marks=marks;
    }

    // calculating the grade using marks
    public char CalculateGrade(double marks)
    {
        if(marks>90) return 'A';
        else if (marks>=80 && marks<90) return 'B';
        else if (marks>=70 && marks<70)return 'C';
        else return 'D';

    }
    // displaying the output
    public void DisplayOutput(){
        System.out.println("The Student Details are As Follow ");
        System.out.println("THe Student Name is :" + name );
        System.out.println("The Student Roll Number is :"+rollNumber);
        System.out.println("The Student Grade  are " + CalculateGrade(marks) );
    }
}
public class Student {
    public static void main(String[] args) {
        // Scanner to take input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Name");
        String name= input.next();
        System.out.println("Enter the Roll Number");
        int rollNumber = input.nextInt();
        System.out.println("Enter the Marks");
        double marks = input.nextInt();
        // created the constructor and calling it
        StudentDetails details= new StudentDetails( name , rollNumber, marks);
        // calling the Display out put method
        details.DisplayOutput();

    }
}
