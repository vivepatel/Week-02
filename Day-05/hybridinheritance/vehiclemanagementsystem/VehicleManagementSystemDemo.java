package hybridinheritance.vehiclemanagementsystem;

// Main Class to Demonstrate Hybrid Inheritance
public class VehicleManagementSystemDemo {
    public static void main(String[] args) {
        System.out.println("Electric Vehicle:");
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 250, 100);
        ev.displayDetails();
        ev.charge();

        System.out.println("\nPetrol Vehicle:");
        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 300, 60);
        pv.displayDetails();
        pv.refuel();
    }
}