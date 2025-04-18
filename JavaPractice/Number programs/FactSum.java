public class FactSum{
	public static void main(String []  args)
	{
		int n = 1254;
		int a = fact(n);
		System.out.println("Fact : " +a);
		System.out.println("Sum Of digits is : " +separate(a));
		
		
		
	}
	
	public static int fact(int n)
	{	int fact = 1;
		for(int i = 1 ; i<=n ; i++)
		{
			fact = fact *i;
		}
		return fact;
	}
	
	public static int separate(int n )
	{
		int rem = 0,sum=0;
		for(int i = n ; i!=0 ; i/=10)
		{
			rem=i%10;
			sum+=rem;
		}
		return sum;
	}
}
			
	