// Parent class
class Railway {
    // Method in the parent class
    public void speed() {
        System.out.println("Speed of the train is 80 km/h.");
    }
}

// Child class 1: Express
class Express extends Railway {
    // Method specific to Express
    public void fast() {
        System.out.println("Express train speed is 120 km/h.");
    }
}

// Child class 2: VandeBharat
class VandeBharat extends Railway {
    // Method specific to VandeBharat
    public void superfast() {
        System.out.println("Vande Bharat speed is 160 km/h.");
    }
}

public class IndianRail{
    public static void main(String[] args) {
        // Creating objects of each class
        Railway railway = new Railway();
        Express express = new Express();
        VandeBharat vandeBharat = new VandeBharat();

        // Calling methods
        railway.speed();          // Calling method from Railway class
        express.speed();          // Inherited method from Railway
        express.fast();           // Method from Express class
        vandeBharat.speed();      // Inherited method from Railway
        vandeBharat.superfast();  // Method from VandeBharat class
    }
}