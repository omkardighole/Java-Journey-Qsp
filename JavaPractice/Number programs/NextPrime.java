import java.util.Scanner;
public class NextPrime{
	public static void main(String [] args)
	{  Scanner sc = new Scanner(System.in);
		System.out.print("Enter Start range: ");
		int start = sc. nextInt();
		System.out.print("Enter End range: ");
		int end = sc. nextInt();
		
		for(int i = start ; i<=end ; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i+  "  ");
			}
		}
	}
	
	public static boolean isPrime(int n)
	{
		if(n==1)
			return false;
		for(int i = 2; i<n; i++)
		{
			if(n%2==0)
				return false;
		}
		return true;
	}
	
}
	