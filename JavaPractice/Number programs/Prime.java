
import java.util.Scanner;
public class Prime{
	public static void main(String [] args)
	{
		for( ; ; ){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number to Check PRIME: " );
		int a = sc. nextInt();
		
		System.out.println(isPrime(a));
		}
	}
	public static boolean isPrime(int n)
	{
		if(n==1)
			return false;
		
		for(int i = 2 ; i<n ; i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}	