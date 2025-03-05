class Power_Method{
	public static void main(String [] args){
		
		System.out.print(power(2,2,1));
		
	}
	
	
	public static int power(int base, int pow ,int product)
	{
		for(int i = 1; i<=pow ; i++)
		{
			product = product *base;
		}
		return product;
	}
}
		