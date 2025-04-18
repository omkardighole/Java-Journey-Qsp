class PrimeNumberRangeSum{
	public static void main(String [] args)
	{
		int range = 10;
		int sum = 0;
		for(int start = 2 ; start<=range; start++)
		{
			if(isPrime(start))
			{
				System.out.print(start+ "  ");
				sum+=start;
			}
			
		}
		System.out.println();
		System.out.println(" The Sum is : " +sum);
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
			