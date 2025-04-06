import java.util.Scanner;

public class GrossSalary {

    public static double calculateGrossSalary(double basicSalary) {
        double HRA, DA, grossSalary;

        if (basicSalary < 1500) {
            // If Basic Salary is less than ₹1500
            HRA = 0.10 * basicSalary;
            DA = 0.90 * basicSalary;
        } else if (basicSalary == 1500) {
            // If Basic Salary is exactly ₹1500
            HRA = 500;
            DA = 0.98 * basicSalary;
        } else {
            // If Basic Salary is more than ₹1500
            HRA = 0.10 * basicSalary;
            DA = 0.90 * basicSalary;
        }

        // Gross Salary is the sum of Basic Salary, HRA, and DA
        grossSalary = basicSalary + HRA + DA;
        return grossSalary;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Input Basic Salary
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate the Gross Salary
        double grossSalary = calculateGrossSalary(basicSalary);

        // Output the result
        System.out.printf("The Gross Salary is: %.2f\n", grossSalary);

        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}