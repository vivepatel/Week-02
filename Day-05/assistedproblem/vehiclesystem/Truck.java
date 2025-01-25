package assistedproblem.vehiclesystem;

// Subclass: Truck, inheriting from Vehicle
class Truck extends Vehicle {
    protected int loadCapacity; // Load capacity of the truck (e.g., in tons)

    // Constructor to initialize the Truck class
    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType); // Call the constructor of the superclass (Vehicle)
        this.loadCapacity = loadCapacity;
    }

    // Override the diplayInfo method to include truck-specific details
    @Override
    public void diplayInfo() {
        System.out.print(" The vehicle is a Truck. ");
        super.diplayInfo(); // Call the superclass method to display common vehicle details
        System.out.println(" The Load Capacity is: " + loadCapacity);
    }
}
