abstract class Bank {
    // Abstract method to get rate of interest
    abstract int getRateOfInterest();
}

class SBI extends Bank {
    // Overriding the abstract method
    int getRateOfInterest() {
        return 7; // SBI's rate of interest is 7%
    }
}

class PNB extends Bank {
    // Overriding the abstract method
    int getRateOfInterest() {
        return 8; // PNB's rate of interest is 8%
    }
}

public class ROIBank {
    public static void main(String[] args) {
        Bank b;
        
        // Assigning SBI object to Bank reference
        b = new SBI();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + "%");
        
        // Assigning PNB object to Bank reference
        b = new PNB();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + "%");
    }
}