      import java.util.Scanner;
public class CelsiusToFahrenheit{
	public static void main(String [] args){
		System.out.println("Program to convert the Celsius Temperature to Fahrenheit ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Temperature in Degree Celsius :");
		
		 double c = sc.nextDouble();
		 
		 double f =(9.0/5.0) * c + 32 ;
		 
		 System.out.println("Temperature in Fahrenheit is : " +f);
	}
}
		 