package encapsulationandpolymorphism.ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

// Main class
public class RideHailingApplication {
    public static void main(String[] args) {
        // Creating a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Adding different vehicle types
        Vehicle car = new Car("C001", "John Doe", 15);
        Vehicle bike = new Bike("B001", "Jane Smith", 10);
        Vehicle auto = new Auto("A001", "Bob Brown", 12);

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Updating and displaying vehicle locations
        if (car instanceof GPS) {
            ((GPS) car).updateLocation("Downtown");
            System.out.println("Car Location: " + ((GPS) car).getCurrentLocation());
        }
        if (bike instanceof GPS) {
            ((GPS) bike).updateLocation("Uptown");
            System.out.println("Bike Location: " + ((GPS) bike).getCurrentLocation());
        }
        if (auto instanceof GPS) {
            ((GPS) auto).updateLocation("Suburb");
            System.out.println("Auto Location: " + ((GPS) auto).getCurrentLocation());
        }

        // Calculating fares
        double distance = 10; // Example distance
        System.out.println();
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
            System.out.println();
        }
    }
}
