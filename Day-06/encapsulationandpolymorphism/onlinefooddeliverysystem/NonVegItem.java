package encapsulationandpolymorphism.onlinefooddeliverysystem;

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private static final double ADDITIONAL_CHARGE = 50; // Flat additional charge for non-veg items

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() * getQuantity()) + ADDITIONAL_CHARGE;
        return total - (total * discount / 100);
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = discountPercentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discount + "% applied on Non-Veg Item.";
    }
}
