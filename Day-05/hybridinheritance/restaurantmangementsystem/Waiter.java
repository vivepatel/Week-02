package hybridinheritance.restaurantmangementsystem;

// Subclass: Waiter
class Waiter extends Person implements Worker {
    private String section;

    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    @Override
    public void performDuties() {
        System.out.println("Duties: Serving customers, taking orders, and managing the " + section + " section.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Waiter");
        System.out.println("Section: " + section);
    }
}
