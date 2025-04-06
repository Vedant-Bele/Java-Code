import java.util.Scanner;

public class CarPurchase {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Using if-else to determine which car can be bought based on salary
        if (salary >= 100000) {
            System.out.println("You can affort a Toyota Fortuner");
        } else if (salary >= 50000) {
            System.out.println("You can affort a Mahindra Scorpio");
        } else if (salary >= 30000) {
            System.out.println("You can affort a Toyota Innova");
        } else {
            System.out.println("You can afford a used car or need to save more!");
        }

        // Close the scanner
        scanner.close();
    }
}
