// Class: Vehicle
class Vehicle {
    // Static members
    static double registrationFee = 500.0; // Default registration fee for all vehicles
    static int vehicleCounter = 0; // To generate unique registration numbers

    // Final variable
    final int registrationNumber;

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.registrationNumber = ++vehicleCounter; // Unique registration number for each vehicle
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) {
            registrationFee = newFee;
        } else {
            System.out.println("Invalid registration fee! It must be non-negative.");
        }
    }

    // Method to display vehicle details
    public void displayRegistrationDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }
}

// Main class
public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Creating Vehicle objects
        Vehicle vehicle1 = new Vehicle("Alice", "Car");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle");

        // Display vehicle details before fee update
        System.out.println("Vehicle Registration Details Before Fee Update:");
        vehicle1.displayRegistrationDetails();
        System.out.println();
        vehicle2.displayRegistrationDetails();

        // Update the registration fee
        System.out.println("\nUpdating Registration Fee...");
        Vehicle.updateRegistrationFee(600.0); // Set a new registration fee

        // Display vehicle details after fee update
        System.out.println("\nVehicle Registration Details After Fee Update:");
        vehicle1.displayRegistrationDetails();
        System.out.println();
        vehicle2.displayRegistrationDetails();

        // Validate instances using instanceof
        System.out.println("\nInstanceof Validation:");
        if (vehicle1 instanceof Vehicle) {
            System.out.println("Vehicle1 is an instance of Vehicle.");
        }
        if (vehicle2 instanceof Vehicle) {
            System.out.println("Vehicle2 is an instance of Vehicle.");
        }
    }
}
