public class StrongNumber{
	static int sum;
	public static void main(String [] args)
	{	
	int n = 145;
		if(dgt(n)==n)
		{
			System.out.println("Strong Number");
		}
		else
			System.out.println("NOT Strong Number");
			
	}
	
	public static int dgt(int b)
	{int rem = 0;
		for(int i = b ; i>0;i/=10)
		{
			rem= i%10;
			sum+=fact(rem);
		}
		return sum;
	}
			
	
	public static int fact(int n)
	{int fact = 1;
		for(int i = 1 ; i<=n ; i++)
		{
			fact*=i;
		}
		return fact;
	}
}	