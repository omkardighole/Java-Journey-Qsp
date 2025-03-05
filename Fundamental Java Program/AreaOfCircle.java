  import java.util.Scanner;
public class AreaOfCircle{
   public static void main(String [] args){
	Scanner sc = new Scanner( System.in);
	System.out.println("Enter the radius to find the Perimeter and Area of circle :");
	float r=sc.nextFloat();
 
	final float pi = 22/7f;

	float area = pi*(r*r);
	
	float perimeter = (2*pi*r);
	
	System.out.println("The Perimeter of Circle is : "+perimeter);

	System.out.println("The Area Of circle is " +area + "sq. cm");
	}
}