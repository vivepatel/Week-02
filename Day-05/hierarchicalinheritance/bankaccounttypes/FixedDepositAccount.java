package hierarchicalinheritance.bankaccounttypes;

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int depositTerm; // Term in months

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals are not allowed for Fixed Deposit Accounts!");
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
