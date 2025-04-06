import java.util.Scanner;

public class Overloading {

    // Method to calculate the area of a square
    static int area(int s) {
        return s * s;
    }

    // Method to calculate the area of a triangle
    static double area(double h, double b) {
        return (b * h) / 2;
    }

    // Method to calculate the area of a circle
    static double area(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for the square side
        System.out.print("Enter side of square: ");
        int s = sc.nextInt();

        // Get user input for the circle radius
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        // Get user input for the triangle height and breadth
        System.out.print("Enter height of triangle: ");
        double h = sc.nextDouble();

        System.out.print("Enter breadth of triangle: ");
        double b = sc.nextDouble();

        // Display results
        System.out.println("The Area of Square is: " + area(s));
        System.out.println("The Area of Circle is: " + area(r));
        System.out.println("The Area of Triangle is: " + area(h, b));
    }
}