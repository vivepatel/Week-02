package encapsulationandpolymorphism.ecommerceplatform;
import java.util.ArrayList;
import java.util.List;

// Main class
public class ECommercePlatform {
    // Method to calculate and print final price
    public static void calculateFinalPrice(List<Product> products) {
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = 0.0;

            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
                System.out.println(((Taxable) product).getTaxDetails());
            }

            double finalPrice = product.getPrice() + tax - discount;
            System.out.printf("Product: %s | Final Price: %.2f\n", product.getName(), finalPrice);
        }
    }

    public static void main(String[] args) {
        // Creating product list
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("E101", "Laptop", 50000));
        products.add(new Clothing("C202", "T-Shirt", 1000));
        products.add(new Groceries("G303", "Rice", 500));

        // Calculating and printing final prices
        calculateFinalPrice(products);
    }
}
