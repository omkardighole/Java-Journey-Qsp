import java.util.Scanner;
public class Exception_Divide_by_Zero{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first Number :");
		int num = sc.nextInt();
		
		System.out.print("Enter the Second Number :");
		int den = sc.nextInt();
		
		try{
			int result = num/den;
			System.out.println("Answer is " + result);
			}
		catch(ArithmeticException ref)
		{
			System.out.println("Dont Divide By Zero");
		}
		System.out.println("Thank You ");
	}
}
		