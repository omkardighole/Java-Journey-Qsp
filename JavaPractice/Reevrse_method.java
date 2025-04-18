class Reevrse_method{
	public static void main(String [] args)
	{
		
		reverse(5486);
	}
	
	public static void reverse(int num)
	{
		int rev = 0;
		int rem = 0;
		for(int i =num ; i>0 ; i/=10)
		{
			rev = rev *10 + (num%10);
			num/=10;
		}
		System.out.println("Reverse of  is :" +rev);
	}
}
			