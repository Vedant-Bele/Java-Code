import java.util.Scanner;

public class DistanceConversion {

    // Method to convert Kilometres to Meters
    public static double kmtom(double kilometers) {
        return kilometers * 1000;  // 1 kilometer = 1000 meters
    }

    // Method to convert Meters to Centimetres
    public static double mtocm(double meters) {
        return meters * 100;  // 1 meter = 100 centimetres
    }

    // Method to convert Centimetres to Millimetres
    public static double cmtomm(double centimetres) {
        return centimetres * 10;  // 1 centimetre = 10 millimetres
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Convert Kilometres to Meters
        System.out.print("Enter distance in Kilometres: ");
        double kilometers = scanner.nextDouble();
        double meters = kmtom(kilometers);
        System.out.println(kilometers + " Kilometres = " + meters + " Meters");

        // 2. Convert Meters to Centimetres
        System.out.print("Enter distance in Meters: ");
        double metersInput = scanner.nextDouble();
        double centimetres = mtocm(metersInput);
        System.out.println(metersInput + " Meters = " + centimetres + " Centimetres");

        // 3. Convert Centimetres to Millimetres
        System.out.print("Enter distance in Centimetres: ");
        double centimetresInput = scanner.nextDouble();
        double millimetres = cmtomm(centimetresInput);
        System.out.println(centimetresInput + " Centimetres = " + millimetres + " Millimetres");

        scanner.close();
    }
}