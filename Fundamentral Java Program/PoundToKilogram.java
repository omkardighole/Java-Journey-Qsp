    import java.util.Scanner;
public class PoundToKilogram{
	public static void main( String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number in pound to convert it to kilogram:");
		float num = sc.nextFloat();
		
		final float kg = 0.454f;
		
		float poundToKg = num * kg;
		
		System.out.println("The Pound " +num+  " to Kilogram is " +poundToKg+ "Kg");
	}
}
		
		