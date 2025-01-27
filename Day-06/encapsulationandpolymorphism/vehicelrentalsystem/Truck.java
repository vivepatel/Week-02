package encapsulationandpolymorphism.vehicelrentalsystem;

// Truck class
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5; // Higher rate for trucks
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.2; // 20% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insurancePolicyNumber + ", Insurance Cost: " + calculateInsurance();
    }
}
