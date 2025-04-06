import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    double cgpa;

    // Constructor to initialize student details
    public Student(String name, int rollNo, double cgpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("CGPA: " + cgpa);
    }

    // Method to evaluate performance based on CGPA
    public void evaluatePerformance() {
        if (cgpa >= 9) {
            System.out.println("Performance: Excellent");
        } else if (cgpa >= 8) {
            System.out.println("Performance: Very Good");
        } else if (cgpa >= 7) {
            System.out.println("Performance: Good");
        } else if (cgpa >= 6) {
            System.out.println("Performance: Average");
        } else {
            System.out.println("Performance: Below Average");
        }
    }
}

public class CollegePerformance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student's roll number: ");
        int rollNo = scanner.nextInt();
        System.out.print("Enter student's CGPA: ");
        double cgpa = scanner.nextDouble();

        // Create student object
        Student student = new Student(name, rollNo, cgpa);

        // Display student details and performance
        student.displayStudentDetails();
        student.evaluatePerformance();

        scanner.close();
    }
}