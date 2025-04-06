import java.util.Scanner;

// Abstract class Operations
abstract class Operations {
    abstract int add(int a, int b);
    abstract int sub(int a, int b);
    abstract int mul(int a, int b);
    abstract int div(int a, int b);
}

// Class Calculator extends Operations
class Calculator12 extends Operations {

    // Implementing the add method
    @Override
    int add(int a, int b) {
        return a + b;
    }

    // Implementing the sub method
    @Override
    int sub(int a, int b) {
        return a - b;
    }

    // Implementing the mul method
    @Override
    int mul(int a, int b) {
        return a * b;
    }

    // Implementing the div method
    @Override
    int div(int a, int b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return 0;
        }
        return a / b;
    }
}

// Main class to test Calculator
public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create an instance of Calculator
        Calculator12 myCal = new Calculator12();
        
        // Take two numbers as input
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Perform calculations and print results
        System.out.println("Addition: " + myCal.add(a, b));
        System.out.println("Subtraction: " + myCal.sub(a, b));
        System.out.println("Multiplication: " + myCal.mul(a, b));
        System.out.println("Division: " + myCal.div(a, b));
        
        sc.close();
    }
}