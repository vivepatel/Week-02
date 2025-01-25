package assistedproblem.animalhierarchy;

// Subclass: Dog, inheriting from Animal
class Dog extends Animal {

    // Constructor to initialize the Dog class
    public Dog(String name, int age) {
        super(name, age); // Call the constructor of the superclass (Animal)
    }

    // Override the sound method to specify the sound a dog makes
    @Override
    public void sound() {
        System.out.println(name + " makes the sound: Bark.");
    }
}