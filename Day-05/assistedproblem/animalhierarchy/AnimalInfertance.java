package assistedproblem.animalhierarchy;

// Main class to demonstrate inheritance
public class AnimalInfertance {
    public static void main(String[] args) {
        // Create a Dog object as an Animal reference
        Animal dog = new Dog("Mishty", 21);

        // Create a Cat object as an Animal reference
        Animal cat = new Cat("Billi", 22);

        // Create a Bird object as an Animal reference
        Animal bird = new Bird("Chidiya", 22);

        // Call displayDetails and sound methods for the Dog object
        dog.diplayDetails();
        dog.sound();

        // Call displayDetails and sound methods for the Cat object
        cat.diplayDetails();
        cat.sound();

        // Call displayDetails and sound methods for the Bird object
        bird.diplayDetails();
        bird.sound();
    }
}
