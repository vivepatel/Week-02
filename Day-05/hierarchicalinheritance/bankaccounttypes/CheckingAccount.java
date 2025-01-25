package hierarchicalinheritance.bankaccounttypes;

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal failed! Amount exceeds the limit of $" + withdrawalLimit);
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}
