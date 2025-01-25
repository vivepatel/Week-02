package hybridinheritance.restaurantmangementsystem;

// Main Class to Demonstrate Hybrid Inheritance
public class RestaurantSystemDemo {
    public static void main(String[] args) {
        System.out.println("Chef:");
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        chef.displayDetails();
        chef.performDuties();

        System.out.println("\nWaiter:");
        Waiter waiter = new Waiter("John Doe", 102, "Main Hall");
        waiter.displayDetails();
        waiter.performDuties();
    }
}
