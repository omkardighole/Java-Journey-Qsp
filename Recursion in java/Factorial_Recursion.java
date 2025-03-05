class Factorial_Recursion{
	public static void main(String [] args)
	{
		System.out.print(fact(4));
	}
	public static int fact (int num)
	{
		if(num==0)
			return 1;
		return num*fact(num-1);
	}
}