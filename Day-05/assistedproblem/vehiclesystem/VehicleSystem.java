package assistedproblem.vehiclesystem;

// Main class to demonstrate the Vehicle system
public class VehicleSystem {
    public static void main(String[] args) {
        // Create an array of Vehicle references to hold different types of vehicles
        Vehicle vehicle[] = new Vehicle[3];

        // Create and initialize different types of vehicles
        vehicle[0] = new Car(60, "Petrol", 4); // Car with max speed 60, fuel type Petrol, and 4 seats
        vehicle[1] = new Truck(5, "Diesel", 300); // Truck with max speed 5, fuel type Diesel, and 300 tons load capacity
        vehicle[2] = new Bike(500, "Petrol", 2); // Bike with max speed 500, fuel type Petrol, and 2 tires

        // Loop through the array and call diplayInfo() for each vehicle
        for (Vehicle vehicle1 : vehicle) {
            vehicle1.diplayInfo();
        }
    }
}
