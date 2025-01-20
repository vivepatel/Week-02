public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable
    private static double registrationFee = 500.0; // Default registration fee

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) {
            registrationFee = newFee;
        } else {
            System.out.println("Registration fee cannot be negative!");
        }
    }

    public static void main(String[] args) {
        // Setting the registration fee
        Vehicle.updateRegistrationFee(600.0);

        // Creating vehicles
        Vehicle vehicle1 = new Vehicle("John Doe", "Car");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle");
        Vehicle vehicle3 = new Vehicle("Alice Brown", "Truck");

        // Displaying vehicle details
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayVehicleDetails();

        System.out.println("\nVehicle 3 Details:");
        vehicle3.displayVehicleDetails();

        // Updating the registration fee
        Vehicle.updateRegistrationFee(700.0);
        System.out.println("\nRegistration Fee Updated:");

        // Displaying vehicle details again to reflect the updated registration fee
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        vehicle3.displayVehicleDetails();
    }
}
