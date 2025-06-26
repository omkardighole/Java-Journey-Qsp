import java.util.Scanner;
public class Exception_Divide_by_Zero_Diff_DataTypes{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first Number :");
		float  num = sc.nextFloat();
		
		System.out.print("Enter the Second Number :");
		float den = sc.nextFloat();
		
		try{
			float result = num/den;
			System.out.println("Answer is " + result);
			}
		catch(ArithmeticException ref)
		{
			System.out.println("Dont Divide By Zero");
		}
		System.out.println("Thank You ");
	}
}
		