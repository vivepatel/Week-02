// Base class: BankAccount
class BankAccount {
    // Public member
    static String bankname;
     final String accountNumber;
    static int count=0;

    // Protected member
    protected String accountHolder;

    // Private member
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.bankname = bankname;
        count++;
    }

   static int getTotalAccounts(){
        return count;
   }
    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify the balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate; // Additional attribute for SavingsAccount

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance); // Call the superclass constructor
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    // Method to display SavingsAccount details
    public void displaySavingsAccountDetails() {
        // Accessing the public member `accountNumber` from the base class
        if(this instanceof BankAccount) {
            System.out.println("Account Number: " + accountNumber);  // Accessing public member `accountNumber`
            System.out.println("Account Holder: " + accountHolder); // Accessing protected member `accountHolder`
            System.out.println("Balance: $" + getBalance()); // Access private `balance` via getter method
            System.out.println("Interest Rate: " + interestRate + "%");
            System.out.println("Interest: $" + calculateInterest());
        }
        else {
            System.out.println("the object is not valid");
        }
    }
}

// Main class
public class BankManagementSystem {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account1 = new BankAccount("123456789", "John Doe", 5000.00);
        System.out.println("Bank Account Details:");
        account1.displayAccountDetails();

        // Modifying balance using setter
        account1.setBalance(6000.00);
        System.out.println("\nUpdated Bank Account Details:");
        account1.displayAccountDetails();

        // Creating a SavingsAccount object
        SavingsAccount savingsAccount1 = new SavingsAccount("987654321", "Alice Smith", 10000.00, 5.0);
        System.out.println("\nSavings Account Details:");
        savingsAccount1.displaySavingsAccountDetails();

        System.out.println("Total numbers of Account :"+ BankAccount.getTotalAccounts());
    }
}
