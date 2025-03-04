import java.util.Scanner;
class PalindromicPrime_UsingMethods
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number");
		
		int ip = sc.nextInt();
		int rev = reverse(ip);
		
		if(ip==rev  && isPrime(ip))
		{
			System.out.println("Palindromic Prime Number");
		}
		else{
			System.out.println("Not Palindromic Prime Number");
		}
	}
	
	public static int reverse(int num)
	{
		int rev = 0;
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		return rev;
	}
	public static boolean isPrime(int num)
	{
		int den=2;
		for( ;den<num ; den++)
		{
			if(num%den==0)
			{return false;
			
			}
		}
		return true;
	}
}