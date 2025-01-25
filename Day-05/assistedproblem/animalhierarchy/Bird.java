package assistedproblem.animalhierarchy;

// Subclass: Bird, inheriting from Animal
class Bird extends Animal {

    // Constructor to initialize the Bird class
    public Bird(String name, int age) {
        super(name, age); // Call the constructor of the superclass (Animal)
    }

    // Override the sound method to specify the sound a bird makes
    @Override
    public void sound() {
        System.out.println(name + " makes the sound: Chirp.");
    }
}
