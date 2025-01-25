package multilevelinheritance.onlineordermanage;

// created order as Parent class
class Order
{
    protected int orderId;
    protected int orderdate;
    // created the constructor Order

    public Order(int orderdate, int orderId) {
        this.orderId=orderId;
        this.orderdate=orderdate;
    }
    // created the function getOrderStatus
    public void getOrderStatus()
    {
        System.out.print(" The Order Id :"+ orderId +" Order Date "+ orderdate );
    }


}

