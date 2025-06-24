// Interface defining shape-related operations
interface Shapes {
    // Constant value for pi (all variables in interfaces are public static final by default)
    double pi = 22.0 / 7.0;

    // Abstract method to calculate area of a square
    public abstract void areaOfSquare(int sides);

    // Abstract method to calculate perimeter of a square
    void perimeterOfSquare(int sides);

    // Abstract method to calculate area of a circle
    void areaOfCircle(int rad);
}

// Class implementing the Shapes interface
class ShapesImp implements Shapes {

    // Method to calculate and print area of a circle
    public void areaOfCircle(int rad) {
        double area = pi * (rad * rad); // Area = πr²
        System.out.println(area); // Print the area
    }

    // Method to calculate and print area of a square
    public void areaOfSquare(int sides) {
        int area = sides * sides; // Area = side²
        System.out.println(area); // Print the area
    }

    // Method to calculate and print perimeter of a square
    public void perimeterOfSquare(int sides) {
        int perimeter = 4 * sides; // Perimeter = 4 × side
        System.out.println(perimeter); // Print the perimeter
    }
}

// Driver class to test the implemented methods
public class ShapesDriver {
    public static void main(String[] args) {

        // Creating a reference of interface type and assigning it to implementing class object
        Shapes s1 = new ShapesImp();

        // Calling method to calculate area of circle with radius 10
        s1.areaOfCircle(10); // Output: 314.2857142857143

        // Calling method to calculate area of square with side 10
        s1.areaOfSquare(10); // Output: 100

        // Calling method to calculate perimeter of square with side 10
        s1.perimeterOfSquare(10); // Output: 40
    }
}
