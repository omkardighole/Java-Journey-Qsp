class PrimeNumberinRange_Methods{
	public static void main(String [] args)
	{
		int range = 1000;
		for(int start = 2 ; start<=range; start++)
		{
			if(isPrime(start))
				System.out.print(start+ "  ");
		}
	}
	
	public static boolean isPrime(int num)
	{
		
		for( int den = 2 ; den<num; den++)
		{
			if(num%den==0)
				return false;
		
		}
				return true;

	}
}
			