package multilevelinheritance.onlineordermanage;

// created the class Shiporder and extend By order
class ShippedOrder extends Order {
    protected int trackingNumber;
    public ShippedOrder(int orderdate, int orderId, int trackingNumber) {
        super(orderdate, orderId);
        this.trackingNumber=trackingNumber;
    }

    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.print(" The Trackiing Number is :" + trackingNumber);
    }
}
