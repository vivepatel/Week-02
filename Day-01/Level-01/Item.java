import java.util.Scanner;
// created the class to perform the Operation
 class ItemOperation {
     // Declaring  the Variables
    int itemCode;
    int price;
    int  quantity;
    String itemName;
    // creating the ItemOperation Constructor
    public ItemOperation(int itemCode, String itemname, int price, int quantity) {
      this.itemCode=itemCode;
      this.itemName=itemname;
      this.price=price;
      this.quantity=quantity;
    }
    // created the Display the Output Function
    public void DisplayOutput()
    {
        System.out.println("The Item Details are :");
        System.out.println("The Item Code is :"+ itemCode);
        System.out.println("The Item Name is :"+ itemName);
        System.out.println("The Item Price is "+ price);
        System.out.println("The Total Cost of the Item is :"+ price*quantity);
    }
}
class Item{
    public static void main(String[] args) {
        // created Scanner for taking input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Item Code");
        // taking input Item code
        int itemCode= input.nextInt();
        System.out.println("Enter the Item Name");
        // taking input Item Name
        String itemName= input.next();
        System.out.println("Enter the Price");
        // taking input Item Price
        int price = input.nextInt();
        System.out.println("Enter the Quantity");
        // taking input Item Quantity
        int quantity = input.nextInt();
        // creating the object of the ItemOperation and Creating the constructor
        ItemOperation item=new ItemOperation(itemCode , itemName, price ,  quantity);
        // Calling the funciton to display the output
        item.DisplayOutput();
    }
}
