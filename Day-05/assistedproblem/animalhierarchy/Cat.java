package assistedproblem.animalhierarchy;


// Subclass: Cat, inheriting from Animal
class Cat extends Animal {

    // Constructor to initialize the Cat class
    public Cat(String name, int age) {
        super(name, age); // Call the constructor of the superclass (Animal)
    }

    // Override the sound method to specify the sound a cat makes
    @Override
    public void sound() {
        System.out.println(name + " makes the sound: Meow.");
    }
}

