package assistedproblem.animalhierarchy;

class Animal {
    protected String name; // Name of the animal
    protected int age; // Age of the animal

    // Constructor to initialize the Animal class
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to represent the generic sound animals make
    public void sound() {
        System.out.println("Animals make a generic sound.");
    }

    // Method to display details about the animal
    public void diplayDetails() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}