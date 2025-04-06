import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the traffic light color
        System.out.print("Enter the traffic light color (Red, Yellow, Green): ");
        String lightColor = scanner.nextLine().toLowerCase();

        // Check the color and print the corresponding action
        if (lightColor.equals("red") || lightColor.equals("r")) {
            System.out.println("Stop!");
        } else if (lightColor.equals("yellow") || lightColor.equals("y")) {
            System.out.println("Get Ready!");
        } else if (lightColor.equals("green") || lightColor.equals("g")) {
            System.out.println("Go!");
        } else {
            System.out.println("Invalid input. Please enter 'Red', 'Yellow', or 'Green'.");
        }

        // Close the scanner object
        scanner.close();
    }
}