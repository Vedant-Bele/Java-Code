// Base class MobileBrand
class MobileBrand {
    String name;
    String model;
    double priceUSD;

    // Constructor to initialize the mobile brand
    public MobileBrand(String name, String model, double priceUSD) {
        this.name = name;
        this.model = model;
        this.priceUSD = priceUSD;
    }

    // Method to display mobile brand details in INR
    public void displayDetails() {
        double priceINR = convertUSDToINR(priceUSD);
        System.out.println("Brand: " + name);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + priceINR);
    }

    // Method to convert USD to INR
    private double convertUSDToINR(double priceUSD) {
        double conversionRate = 82.0; // USD to INR conversion rate
        return priceUSD * conversionRate;
    }
}

// Class representing Apple mobile brand, extends MobileBrand
class Apple extends MobileBrand {
    public Apple(String model, double priceUSD) {
        super("Apple", model, priceUSD);
    }

    // Additional Apple-specific methods can go here
    public void showAppleSpecificFeature() {
        System.out.println("This Apple phone has Face ID.");
    }
}

// Class representing Samsung mobile brand, extends MobileBrand
class Samsung extends MobileBrand {
    public Samsung(String model, double priceUSD) {
        super("Samsung", model, priceUSD);
    }

    // Additional Samsung-specific methods can go here
    public void showSamsungSpecificFeature() {
        System.out.println("This Samsung phone has an AMOLED display.");
    }
}

// Main class to test the mobile brand functionality
public class MobileBrandExample {
    public static void main(String[] args) {
        // Create Apple and Samsung instances
        MobileBrand applePhone = new Apple("IPhone 16", 2333.74); // USD price
        MobileBrand samsungPhone = new Samsung("Samsung Galaxy S24 Ultra", 1750.35); // USD price

        // Display details
        System.out.println("Apple Phone Details:");
        applePhone.displayDetails();
        ((Apple) applePhone).showAppleSpecificFeature();

        System.out.println("\nSamsung Phone Details:");
        samsungPhone.displayDetails();
        ((Samsung) samsungPhone).showSamsungSpecificFeature();
    }
}