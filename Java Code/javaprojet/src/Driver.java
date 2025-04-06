import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask for the driver's age with validation
        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            System.out.print("Enter your age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age > 0) {
                    validAge = true;
                } else {
                    System.out.println("Please enter a valid positive age.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number for age.");
                scanner.next(); // Consume the invalid input
            }
        }

        // Ask if the driver has a license
        String hasLicense = "";
        boolean validLicense = false;
        while (!validLicense) {
            System.out.print("Do you have a valid driver's license? (yes/no): ");
            hasLicense = scanner.next().toLowerCase();
            if (hasLicense.equals("yes") || hasLicense.equals("no")) {
                validLicense = true;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }

        // Ask if the driver has insurance
        String hasInsurance = "";
        boolean validInsurance = false;
        while (!validInsurance) {
            System.out.print("Do you have insurance? (yes/no): ");
            hasInsurance = scanner.next().toLowerCase();
            if (hasInsurance.equals("yes") || hasInsurance.equals("no")) {
                validInsurance = true;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }

        // Display the entered information
        System.out.println("\nDriver Information:");
        System.out.println("Age: " + age);
        System.out.println("Has License: " + hasLicense);
        System.out.println("Has Insurance: " + hasInsurance);

        // Check eligibility to drive
        if (age > 18 && hasLicense.equals("yes") && hasInsurance.equals("yes")) {
            System.out.println("\nYou are eligible to drive a vehicle.");
        } else {
            System.out.println("\nYou are not eligible to drive a vehicle.");
            if (age <= 18) {
                System.out.println("You must be over 18 years old to drive.");
            }
            if (hasLicense.equals("no")) {
                System.out.println("You need a valid driver's license.");
            }
            if (hasInsurance.equals("no")) {
                System.out.println("You need valid insurance.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}