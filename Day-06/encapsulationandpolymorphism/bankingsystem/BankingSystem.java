package encapsulationandpolymorphism.bankingsystem;

import java.util.ArrayList;
import java.util.List;

// Main class
public class BankingSystem {
    public static void main(String[] args) {
        // Creating accounts
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("S101", "Alice", 5000, 3.5));
        accounts.add(new CurrentAccount("C202", "Bob", 10000, 5000));

        // Processing accounts polymorphically
        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                loanableAccount.applyForLoan();
                System.out.println("Loan Eligibility: " + loanableAccount.calculateLoanEligibility());
            }

            System.out.println();
        }
    }
}
