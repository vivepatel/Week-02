package encapsulationandpolymorphism.vehicelrentalsystem;
import java.util.ArrayList;
import java.util.List;
// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Creating a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C123", "Car", 1000, "INS001"));
        vehicles.add(new Bike("B456", "Bike", 500));
        vehicles.add(new Truck("T789", "Truck", 2000, "INS002"));

        // Iterating through the list and calculating rental and insurance costs
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));

            if (vehicle instanceof Insurable) {
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
            }

            System.out.println();
        }
    }

}
