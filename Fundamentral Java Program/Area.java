import java.util.Scanner;
public class AreaOfCircle{
 public static void main(String [] args){
 Scanner sc = new Scanner( System.in);
 System.out.println("Enter the radius of circle to find the area:");
float r=sc.nextFloat();
 
final float pi = 22/7f;

float area = pi*r*r;

System.out.println("The Area Of circle is " +area + "sq. cm");
}
}