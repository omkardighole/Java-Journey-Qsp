import java.util.Scanner;
public class Prime_Range{
	public static void main(String [] args)
	{Scanner sc = new Scanner(System.in);
	 System.out.print("Enter n th prime to find: ");
	 int n1 = sc.nextInt();
	  System.out.print("Enter n th prime to find: ");
	 int n2 = sc.nextInt();
	 
		int j = 1;
		for(int i = 1;i<1000;i++)
		{ 
			if(isPrime(i))
			{
				//System.out.println(j+ " = " + i);
				if(j==n1 || j==n2)
					System.out.println(i+ " ");
				j+=;
			}
			continue;
		}
		
	}
	public static boolean isPrime(int n )
	{
		if(n>1)
		{
			for(int i = 2 ; i<n/2 ; i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
			return true ;
		}
		else return false;
	}
}