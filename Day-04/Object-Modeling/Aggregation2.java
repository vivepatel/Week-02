import java.util.ArrayList;
import java.util.List;

// Bank class
class Bank {
    private String name;
    private List<Customer> customers; // Association with Customer

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer, double initialDeposit) {
        customers.add(customer); // Associate customer with the bank
        customer.setBank(this); // Set the bank for the customer
        customer.setBalance(initialDeposit); // Initialize account balance
        System.out.println("Account opened for " + customer.getName() + " with initial deposit: $" + initialDeposit);
    }

    // Display all customers in the bank
    public void displayCustomers() {
        System.out.println("Bank: " + name);
        System.out.println("Customers:");
        for (Customer customer : customers) {
            System.out.println("- " + customer.getName() + " (Balance: $" + customer.getBalance() + ")");
        }
    }

    public String getName() {
        return name;
    }
}

// Customer class
class Customer {
    private String name;
    private double balance;
    private Bank bank; // Association with Bank

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    // Method to view balance
    public void viewBalance() {
        System.out.println(name + "'s Balance: $" + balance);
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(name + " deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(name + " withdrew $" + amount + ". Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}

// Main class to demonstrate association
public class Aggregation2 {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("Global Trust Bank");

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Open accounts for customers
        bank.openAccount(customer1, 1000.0); // Initial deposit for Alice
        bank.openAccount(customer2, 500.0);  // Initial deposit for Bob

        // Customers interact with their accounts
        customer1.deposit(200.0);
        customer1.withdraw(150.0);
        customer1.viewBalance();

        customer2.deposit(300.0);
        customer2.withdraw(700.0); // Insufficient funds
        customer2.viewBalance();

        // Display all customers in the bank
        System.out.println();
        bank.displayCustomers();
    }
}
