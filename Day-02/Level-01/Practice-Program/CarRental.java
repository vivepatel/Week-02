public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Unknown Model";
        this.rentalDays = 0;
        this.dailyRate = 0.0;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Copy constructor
    public CarRental(CarRental other) {
        if (other != null) {
            this.customerName = other.customerName;
            this.carModel = other.carModel;
            this.rentalDays = other.rentalDays;
            this.dailyRate = other.dailyRate;
        }
    }

    // Getters and setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Using the default constructor
        CarRental rental1 = new CarRental();
        System.out.println("Default Rental Details:");
        rental1.displayRentalDetails();

        // Using the parameterized constructor
        CarRental rental2 = new CarRental("Alice Johnson", "Toyota Camry", 5, 50.0);
        System.out.println("\nParameterized Rental Details:");
        rental2.displayRentalDetails();

        // Using the copy constructor
        CarRental rental3 = new CarRental(rental2);
        System.out.println("\nCopied Rental Details:");
        rental3.displayRentalDetails();

        // Modifying the copied rental to verify independence
        rental3.setCustomerName("Bob Smith");
        rental3.setCarModel("Honda Accord");
        rental3.setRentalDays(7);
        rental3.setDailyRate(60.0);
        System.out.println("\nModified Copied Rental Details:");
        rental3.displayRentalDetails();

        // Displaying the original rental to confirm it remains unchanged
        System.out.println("\nOriginal Rental Details After Modification:");
        rental2.displayRentalDetails();
    }
}
