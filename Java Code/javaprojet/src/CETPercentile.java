import java.util.Scanner;

public class CETPercentile {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Asking user for CET percentile
        System.out.print("Enter your CET percentile: ");
        double percentile = scanner.nextDouble();

        // Suggest the best college based on CET percentile
        String college = getBestCollege(percentile);

        // Display the result
        System.out.println("Based on your CET percentile of " + percentile + "%, you can aim for the following college: " + college);

        // Close the scanner
        scanner.close();
    }

    // Method to suggest college based on percentile
    public static String getBestCollege(double percentile) {
        if (percentile >= 99) {
            return "College of Engineering Pune (COEP)";
        } else if (percentile >= 95) {
            return "VJTI Mumbai (Veermata Jijabai Technological Institute)";
        } else if (percentile >= 90) {
            return "Sardar Patel Institute of Technology (SPIT), Mumbai";
        } else if (percentile >= 85) {
            return "Ramdev Baba University (RBU), Nagpur";
        } else if (percentile >= 80) {
            return "Yeshwantrao Chavan College of Engineering (YCCE), Nagpur";
        } else if (percentile >= 70) {
            return "Rajiv Gandhi Institute of Technology, Mumbai";
        } else {
            return "You may want to consider lower-tier colleges or attempt to improve your percentile.";
        }
    }
}