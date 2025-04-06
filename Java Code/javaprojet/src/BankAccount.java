import java.util.Scanner;

public class BankAccount {

    // Instance variables
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accHolder, String accNumber, double bal) {
        accountHolder = accHolder;
        accountNumber = accNumber;
        balance = bal;
    }

    
    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Display balance method
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + balance);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data for account
        System.out.print("Enter your account number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter your account holder name: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter your balance: ");
        double balance = sc.nextDouble();

        // Create a BankAccount object
        BankAccount acc1 = new BankAccount(accountHolder, accountNumber, balance);

        // Display account details
        acc1.displayBalance();

        // Perform some transactions
        acc1.deposit(5000);
        acc1.withdraw(2000.0);

        // Final balance after transactions
        acc1.displayBalance();
    }
}