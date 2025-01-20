// Class: Product
class Product {
    // Static members
    static double discount = 0.0; // Shared discount for all products
    static int productCounter = 0; // To generate unique product IDs

    // Final variable
    final int productID;

    // Instance variables
    private String productName;
    private double price;
    private int quantity;

    // Constructor
    public Product(String productName, double price, int quantity) {
        this.productID = ++productCounter; // Unique ID for each product
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
        } else {
            System.out.println("Invalid discount! It must be between 0% and 100%.");
        }
    }

    // Method to calculate the discounted price
    public double getDiscountedPrice() {
        return price * (1 - discount / 100);
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discounted Price: $" + getDiscountedPrice());
    }
}

// Main class
public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Create Product objects
        Product product1 = new Product("Laptop", 1000, 2);
        Product product2 = new Product("Smartphone", 800, 1);

        // Display product details before discount
        System.out.println("Product Details Before Discount:");
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();

        // Update the discount
        System.out.println("\nApplying Discount...");
        Product.updateDiscount(10.0); // Set a 10% discount

        // Display product details after discount
        System.out.println("\nProduct Details After Discount:");
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();

        // Validate instances using instanceof
        System.out.println("\nInstanceof Validation:");
        if (product1 instanceof Product) {
            System.out.println("Product1 is an instance of Product.");
        }
        if (product2 instanceof Product) {
            System.out.println("Product2 is an instance of Product.");
        }
    }
}
