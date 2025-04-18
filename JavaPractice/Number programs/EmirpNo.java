class EmirpNo{
	public static void main(String [] args)
	{
		int rev = 0;
		int num = 11;
		if(num<2)
			System.out.println("Not Emirp number");
		
		System.out.println(isPrime(num));
		if(isPrime(num))
		{
				rev = isReverse(num);
				if(isPrime(rev))
				{
					System.out.println("is an emirp Number");
				}
				else
				{
					System.out.println("is not an Emirp NUmber");
		
				}
		
		}
		else
		{
				System.out.println("is not an Emirp NUmber");
		
		}
		
	}
	
	public static boolean isPrime(int n)
	{
		for(int i = 2 ; i<n ; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static int isReverse(int number)
	{int re = 0;
		for(int i =number ; i!=0 ; i/=10)
		{
			re= re * 10 + (i%10);
			//number/=10;
		}
		return re;
	}
}
			