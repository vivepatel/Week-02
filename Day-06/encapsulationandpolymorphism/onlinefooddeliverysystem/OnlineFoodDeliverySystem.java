package encapsulationandpolymorphism.onlinefooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

// Main class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Creating a list of food items
        List<FoodItem> order = new   ArrayList<>();
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300, 1);

        // Adding items to the order
        order.add(vegItem);
        order.add(nonVegItem);

        // Applying discounts
        if (vegItem instanceof Discountable) {
            ((Discountable) vegItem).applyDiscount(10); // 10% discount on Veg items
        }
        if (nonVegItem instanceof Discountable) {
            ((Discountable) nonVegItem).applyDiscount(5); // 5% discount on Non-Veg items
        }

        // Processing the order
        double grandTotal = 0;
        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                System.out.println(((Discountable) item).getDiscountDetails());
            }

            System.out.println();
            grandTotal += item.calculateTotalPrice();
        }

        System.out.println("Grand Total: " + grandTotal);
    }
}
