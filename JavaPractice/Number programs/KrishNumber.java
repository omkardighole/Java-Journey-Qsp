class KrishNumber{
	public static void main(String [] args)
	{
		int num = 145;
		int dup = num;
		int rem = 0;
		int sum = 0;
		for(int i = num ; i!=0 ; i/=10)
		{
			rem = i%10;
			sum+=fact(rem);
			num/=10;
		}
		if(dup==sum)
			System.out.println("Krish Number");
		else
			System.out.println("not a Krish Number");
	}
	
	public static int fact(int n)
	{
		int fact = 1;
		for(int i = 1; i<=n ; i++)
		{
			fact*=i;
		}
		return fact;
	}
}
	
			
			