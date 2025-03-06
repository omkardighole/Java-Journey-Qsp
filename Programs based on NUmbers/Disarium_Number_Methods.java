class Disarium_Number_Methods{
	public static void main(String [] args)
	{
		System.out.print(isDisarium(135));
	}
	
	public static boolean isDisarium(int num)
	{
		int ct = count(num);
		int sum = power(ct, num);
		return sum == num;
	}
	
	public static int count(int n) 
	{  
		int count = 0;
		for(int i = n; i > 0; i /= 10)
			count++;
		System.out.println("Count: " + count);
		return count;
	}
	
	public static int power(int pow, int n)
	{
		int sum = 0;
		for(int j = n; j > 0; j /= 10)
		{
			int rem = j % 10;
			int powers = 1;
			
			for(int i = pow; i >= 1; i--) // Fixed inner loop
			{
				powers = powers * rem; // Calculating power
			}
			
			System.out.println("Power : " + powers);
			sum = sum + powers; // Sum the result
			pow--; // Decrement the power for the next digit
		}
		
		System.out.println("Sum: " + sum);
		return sum;
	}
}
