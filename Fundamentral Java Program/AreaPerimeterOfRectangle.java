  import java.util.Scanner;
public class AreaPerimeterOfRectangle{
	public static void main(String [] args){
		System.out.println("Program to find the Area  & Perimeter Of Rectangle ");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Height:");
		float h = sc.nextFloat();
		
		System.out.print("Enter the Width:");
		float w = sc.nextFloat();
		
		float area = w*h;
		float perimeter = 2 * (h + w);
		
		System.out.println("The Area of Rectangle is: " +area+"sq.cm and The perimeter is : " +perimeter);
		
	}
}
		
		
		