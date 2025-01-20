import java.util.Scanner;

public class Circle {
    // initializing the radius as private
    private double radius;
    // created the default constructor
    public Circle()
    {
        // using the constructor chaning
        this(5);
        System.out.println("This is the Default Construtor with the radius"+radius);
    }
    // created the parameterized Constructor
    public Circle(double radius)
    {
        this.radius=radius;
        System.out.println("This is the Default Construtor with the radius"+radius);
    }
    // created the setter and getter method
    public void setRadius()
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }

    public static void main(String[] args) {
        // created the input for taking the inoput from the user
        Scanner input = new Scanner(System.in);
        // created the Circel boject and default constructor
        Circle circle1=new Circle();
        // asking the user to input the value of radius
        System.out.println("Enter the Radius");
        double radius = input.nextDouble();
        // created the Circle object and the parameterized constructor
        Circle circle2=new Circle(radius);

    }
}
