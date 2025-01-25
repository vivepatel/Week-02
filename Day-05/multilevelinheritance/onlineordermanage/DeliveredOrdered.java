package multilevelinheritance.onlineordermanage;

// Created the class DeliveredOrdered
class DeliveredOrdered extends ShippedOrder {
    protected int deliverydate;
    public DeliveredOrdered(int orderdate, int orderId, int trackingNumber, int deliverydate) {
        super(orderdate, orderId, trackingNumber);
        this.deliverydate=deliverydate;
    }

    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("The Deliverdate is "+ deliverydate);
    }
}
