import java.util.Scanner;

class Loan {
    private double loanAmount;
    private int loanTerm;
    private double interestRate;
    private double totalLoanAmount;
    private double monthlyInstallment;

    // Constructor
    public Loan(double loanAmount, int loanTerm, double interestRate) {
        this.loanAmount = loanAmount;
        this.loanTerm = loanTerm;
        this.interestRate = interestRate;
        calculateLoanDetails();
    }

    // Method to calculate the loan details
    private void calculateLoanDetails() {
        double totalInterest = (loanAmount * interestRate * loanTerm) / 100;
        totalLoanAmount = loanAmount + totalInterest;
        monthlyInstallment = totalLoanAmount / (loanTerm * 12);
    }

    // Method to display loan details
    public void displayLoanDetails() {
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Loan Term (in years): " + loanTerm);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Total Loan Amount (including interest): " + totalLoanAmount);
        System.out.println("Monthly Installment: " + monthlyInstallment);
    }

    // Method to check eligibility
    public boolean checkEligibility(double annualIncome) {
        if (annualIncome > 30000) {
            return true;
        } else {
            return false;
        }
    }

    public double getMonthlyInstallment() {
        return monthlyInstallment;
    }

    public double getTotalLoanAmount() {
        return totalLoanAmount;
    }
}

public class BankLoanSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank Loan System!");
        System.out.print("Enter your annual income: ");
        double income = scanner.nextDouble();

        Loan loan = null;

        // Check if user is eligible for a loan
        if (income < 30000) {
            System.out.println("Sorry, you are not eligible for a loan.");
        } else {
            // Prompt user to enter loan amount
            System.out.print("Enter the loan amount you want to apply for: ");
            double loanAmount = scanner.nextDouble();

            // Prompt user to enter loan term (years)
            System.out.print("Enter the loan term (in years): ");
            int loanTerm = scanner.nextInt();

            // Prompt user to enter interest rate
            System.out.print("Enter the annual interest rate (in %): ");
            double interestRate = scanner.nextDouble();

            // Create loan object and calculate details
            loan = new Loan(loanAmount, loanTerm, interestRate);

            // Display loan details
            System.out.println("Loan application successful!");
            loan.displayLoanDetails();

            // Option to repay loan
            System.out.print("Do you want to repay the loan? (yes/no): ");
            String repay = scanner.next();

            if (repay.equalsIgnoreCase("yes")) {
                System.out.println("Loan repayment started!");
                System.out.println("Your monthly installment is: " + loan.getMonthlyInstallment());
                System.out.println("Total loan to be repaid: " + loan.getTotalLoanAmount());
            }
        }

        scanner.close();
    }
}