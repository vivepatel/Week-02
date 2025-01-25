package hierarchicalinheritance.bankaccounttypes;

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate; // Annual interest rate in %

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * (interestRate / 100);
        System.out.println("Annual Interest: $" + interest);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}
