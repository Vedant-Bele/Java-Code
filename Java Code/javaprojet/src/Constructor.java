// Cube class to illustrate constructor overloading
class Cube {

    double width, height, depth;

    // Constructor used when all dimensions are specified
    Cube(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor used when no dimensions are specified
    Cube() {
        width = height = depth = 0;
    }

    // Constructor used when cube is created with a single dimension
    Cube(double len) {
        width = height = depth = len;
    }

    // Method to compute and return volume
    double volume() {
        return width * height * depth;
    }
}

// Driver code
public class Constructor {

    public static void main(String[] args) {

        // Create cubes using various constructors
        Cube myCube1 = new Cube(10, 20, 15);  // Cube with specific dimensions
        Cube myCube2 = new Cube();             // Cube with no dimensions (default)
        Cube myCube3 = new Cube(5);            // Cube with one dimension (len)

        // Get the volume of the first cube
        double vol = myCube1.volume();
        System.out.println("Volume of myCube1 is: " + vol);

        // Get the volume of the second cube
        vol = myCube2.volume();
        System.out.println("Volume of myCube2 is: " + vol);

        // Get the volume of the third cube
        vol = myCube3.volume();
        System.out.println("Volume of myCube3 is: " + vol);
    }
}