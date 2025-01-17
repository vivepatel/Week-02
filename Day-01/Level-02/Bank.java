import java.util.Scanner;
// created the class Bank Account for the operation
class BankAccount{

    int accountNumber;
    int balance;
    String accountHolder;
    // created the constructor BankAccount
    public BankAccount(int accountNumber, String accountHolder, int balance) {
        this.accountHolder=accountHolder;
        this.balance=balance;
        this.accountNumber=accountNumber;
    }
    // created the function for depositing Money
    public  void Deposit(int amount)
    {
        if(amount>0)
        {
            balance +=amount;
            System.out.println("Thankyou for deposit Of "+ amount);

        }else
        {
            System.out.println("Enter the Amount More than 0");
        }
    }
    // created Function withdraw
    public void Withdraw(int amount)
    {
        if(balance>0 && balance>=amount)
        {
            System.out.println("Thankyou for Comming ");
            System.out.println("TO with draw the Amount $" +amount);
            balance -=amount;
        }
        else
        {
            System.out.println("Insufficent Balance");
        }
    }
    // created the function to display the Current balance in the account
    public  void DisplayCuurentBalance()
    {
        System.out.println("Current Balance Is : $"+balance);
    }

}
public class Bank {
    public static void main(String[] args) {
        // Scanner taking input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Name Of Account Holder ");
        String accountHolder = input.next();
        System.out.println("Enter the Account Number ");
        int accountNumber = input.nextInt();
        System.out.println("Enter the Balance");
        int  balance = input.nextInt();
        // created the constructor and initilized it
        BankAccount user = new BankAccount( accountNumber,accountHolder,balance );
        // calling deposit funciton
        user.Deposit(500);
        // calling withdraw fuction
        user.Withdraw(300);
        // calling Display Current Balcnce
        user.DisplayCuurentBalance();
    }
}
