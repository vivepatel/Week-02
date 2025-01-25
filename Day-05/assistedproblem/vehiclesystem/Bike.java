package assistedproblem.vehiclesystem;

// Subclass: Bike, inheriting from Vehicle
class Bike extends Vehicle {
    protected int tyre; // Number of tires in the bike

    // Constructor to initialize the Bike class
    public Bike(int maxSpeed, String fuelType, int tyre) {
        super(maxSpeed, fuelType); // Call the constructor of the superclass (Vehicle)
        this.tyre = tyre;
    }

    // Override the diplayInfo method to include bike-specific details
    @Override
    public void diplayInfo() {
        System.out.print(" The vehicle is a Bike. ");
        super.diplayInfo(); // Call the superclass method to display common vehicle details
        System.out.println(" The Total Number of Tyres is: " + tyre);
    }
}
