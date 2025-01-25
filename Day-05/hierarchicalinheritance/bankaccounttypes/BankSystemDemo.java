package hierarchicalinheritance.bankaccounttypes;

// Main Class to Demonstrate Hierarchical Inheritance
public class BankSystemDemo {
    public static void main(String[] args) {
        System.out.println("Savings Account:");
        SavingsAccount savings = new SavingsAccount("SA12345", 5000.0, 4.5);
        savings.displayAccountDetails();
        savings.displayAccountType();
        savings.calculateInterest();
        savings.deposit(1000);
        savings.withdraw(2000);

        System.out.println("\nChecking Account:");
        CheckingAccount checking = new CheckingAccount("CA67890", 3000.0, 1000.0);
        checking.displayAccountDetails();
        checking.displayAccountType();
        checking.withdraw(1200); // Exceeds withdrawal limit
        checking.withdraw(800);  // Within limit
        checking.deposit(500);

        System.out.println("\nFixed Deposit Account:");
        FixedDepositAccount fixed = new FixedDepositAccount("FDA54321", 10000.0, 12);
        fixed.displayAccountDetails();
        fixed.displayAccountType();
        fixed.withdraw(2000); // Withdrawal not allowed
    }
}
