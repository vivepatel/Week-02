package assistedproblem.vehiclesystem;

// Base class: Vehicle
class Vehicle {
    protected int maxSpeed; // Maximum speed of the vehicle
    protected String fuelType; // Type of fuel used (e.g., Petrol, Diesel)

    // Constructor to initialize the Vehicle class
    public Vehicle(int maxSpeed, String fuelType) {
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
    }

    // Method to display basic information about the vehicle
    public void diplayInfo() {
        System.out.print(" Max Speed is " + maxSpeed + " The Fuel Type is: " + fuelType);
    }
}
