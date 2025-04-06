import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for grade and family income
        int grade;
        double income;

        // Ask for student's grade and family income
        System.out.print("Enter the student's grade: ");
        grade = scanner.nextInt();

        System.out.print("Enter the family's income: ");
        income = scanner.nextDouble();

        // Check eligibility based on grade and income
        if (grade >= 85 && income < 10000) {
            System.out.println("You are eligible for the Scholarship!");
        } else {
            if (grade < 85) {
                System.out.println("You are ineligible for the Scholarship because your grade is below 85.");
            }
            if (income >= 10000) {
                System.out.println("You are ineligible for the Scholarship because your family's income is above $10,000.");
            }
        }

        // Close the scanner object
        scanner.close();
    }
}