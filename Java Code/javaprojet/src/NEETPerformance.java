import java.util.Scanner;

public class NEETPerformance {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for NEET marks
        System.out.print("Enter your NEET marks: ");
        int marks = scanner.nextInt();
        
        // Determine the possible degree based on the marks
        if (marks >= 650) {
            System.out.println("You can pursue MBBS (Bachelor of Medicine, Bachelor of Surgery).");
        } else if (marks >= 705) {
            System.out.println("You can pursue BDS (Bachelor of Dental Surgery).");
        } else if (marks >= 550) {
            System.out.println("You can pursue BAMS (Bachelor of Ayurvedic Medicine and Surgery).");
        } else if (marks >= 450) {
            System.out.println("You can pursue BHMS (Bachelor of Homeopathic Medicine and Surgery).");
        } else if (marks >= 300) {
            System.out.println("You can pursue BPT (Bachelor of Physiotherapy).");
        } else {
            System.out.println("Unfortunately, your score may not qualify for the popular medical degree courses. However, you can explore other career options.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
