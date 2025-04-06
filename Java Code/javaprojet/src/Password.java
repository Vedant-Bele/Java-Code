import java.util.Scanner;

public class Password {

    // Method to validate the password
    public static void validatePassword(String password) {
        // Check if the password is at least 8 characters long
        if (password.length() < 8) {
            System.out.println("Password is invalid: Must be at least 8 characters long.");
            return;
        }

        // Check if the password contains at least one special character (@ or #)
        if (!password.contains("@") && !password.contains("#")) {
            System.out.println("Password is invalid: Must contain at least one special character (@ or #).");
            return;
        }

        // If both conditions are satisfied
        System.out.println("Password is valid.");
    }

    public static void main(String[] args) {
        // Scanner for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the password
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Validate the password
        validatePassword(password);

        // Close the scanner
        scanner.close();
    }
}