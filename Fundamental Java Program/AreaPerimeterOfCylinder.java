import java.util.Scanner;
public class AreaPerimeterOfCylinder{
	public static void main(String [] args){
		System.out.println("Program to find the Area and Volume of Cylinder ");
		Scanner sc = new Scanner(System.in);
		final float pi = 3.14f;
		System.out.print("Enter the Radius and Height of Cylinder :");
		
		float r = sc.nextFloat();
		float h = sc.nextFloat();
		
		float area = pi * r * r;
		float volume = area * h ;
		
		System.out.println(" The Area of Cylinder is : " +area+ "sq.cm and the volume is " +volume+ "cu.cm ");
	}
}	