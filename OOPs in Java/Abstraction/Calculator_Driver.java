// Abstract class
abstract class Calculator {
    String brand = "Casio";

    // Constructor
    public Calculator() {
        System.out.println("Calculator brand: " + brand);
    }

    // Abstract methods (no body)
    public abstract void add(int n1, int n2);
    public abstract void subtract(int n1, int n2);
    public abstract void multiplication(int n1, int n2);

    // Concrete method
    public void division(double n1, double n2) {
        System.out.println("Division: " + (n1 / n2));
    }
}

// Implementation class
class Calculator_Implementation extends Calculator {

    public void add(int n1, int n2) {
        System.out.println("Addition: " + (n1 + n2));
    }

    public void subtract(int n1, int n2) {
        System.out.println("Subtraction: " + (n1 - n2));
    }

    public void multiplication(int n1, int n2) {
        System.out.println("Multiplication: " + (n1 * n2));
    }

    // Method only in child class
    public void message() {
        System.out.println("Extra message method from child class");
    }
}


public class Calculator_Driver{
	public static void main(String [] args)
	{
		Calculator c1 = new Calculator_Implementation();//upcasting
		c1.add(12,12);
		c1.division(6,3);
		c1.multiplication(2,2);
		
		//c1.message();
	}
}
		
