package multilevelinheritance.onlineordermanage;

// the main class where we call all the Object
public class OnlineOrderMangement {
    public static void main(String[] args) {

        DeliveredOrdered deliveredOrded= new DeliveredOrdered(12 ,345,744844,5);
        deliveredOrded.getOrderStatus();
    }
}
