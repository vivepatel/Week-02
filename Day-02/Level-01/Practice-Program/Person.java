public class Person {
    private String name;
    private int age;


    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        if (other != null) {
            this.name = other.name;
            this.age = other.age;
        }
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating a person object
        Person person1 = new Person("Satyam", 25);
        person1.display();

        // Creating a copy using the copy constructor
        Person person2 = new Person(person1);
        person2.display();

        // Modifying the copy to check independence
        person2.setName("Vivek");
        person2.setAge(21);

        // Displaying both objects to verify they are independent
        System.out.println("After change");
        person1.display();
        person2.display();
    }
}
