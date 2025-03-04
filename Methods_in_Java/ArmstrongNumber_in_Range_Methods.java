class ArmstrongNumber_in_Range_Methods{
	public static void main(String [] args)
	{  int n = 100000;
		for(int start = 1 ; start<= n; start++)
		{
			if(isArmstrong(start))
				System.out.print(start+ " ");
		}
	}
	
	public static boolean isArmstrong(int num)
	{
		int ct = count(num);
		int sum = 0;
		for(int i = num ; i>0;i/=10)
		{	
			int digit = i%10;
			sum=sum + power(digit , ct);
		}
		return num == sum;
	}
	
	public static int count(int number)
	{int ct=0;
		for(int i = number ; number>0; number/=10)
			ct++;
		return ct;
	}
	
	public static int power(int digit,int ct)
	{	int pow = 1;
		for(int i = 0;i<ct ; i++)
		{
			pow*=digit;
		}
		return pow;
	}
}