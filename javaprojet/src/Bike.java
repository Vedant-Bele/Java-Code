// Bike.java
public class Bike {
    // Attributes of the Bike class
    private String brand;
    private String model;
    private int gearCount;
    private boolean isElectric;

    // Constructor to initialize the bike's attributes
    public Bike(String brand, String model, int gearCount, boolean isElectric) {
        this.brand = brand;
        this.model = model;
        this.gearCount = gearCount;
        this.isElectric = isElectric;
    }

    // Getters and Setters for the attributes
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    // Method to display bike details
    public void displayBikeInfo() {
        System.out.println("Bike Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Gear Count: " + gearCount);
        System.out.println("Electric: " + (isElectric ? "Yes" : "No"));
    }

    // Method to simulate riding the bike
    public void ride() {
        System.out.println("Riding the " + brand + " " + model + "...");
    }

    // Main method to create a Bike object and test the methods
    public static void main(String[] args) {
        // Create a new bike object
        Bike myBike = new Bike("YAMAHA", "R15", 6, false);

        // Display bike information
        myBike.displayBikeInfo();

        // Ride the bike
        myBike.ride();
    }
}