package assistedproblem.vehiclesystem;

// Subclass: Car, inheriting from Vehicle
class Car extends Vehicle {
    protected int seatCapacity; // Number of seats in the car

    // Constructor to initialize the Car class
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType); // Call the constructor of the superclass (Vehicle)
        this.seatCapacity = seatCapacity;
    }

    // Override the diplayInfo method to include car-specific details
    @Override
    public void diplayInfo() {
        System.out.print(" The vehicle is a Car. ");
        super.diplayInfo(); // Call the superclass method to display common vehicle details
        System.out.println(" The Seat Capacity is: " + seatCapacity);
    }
}
