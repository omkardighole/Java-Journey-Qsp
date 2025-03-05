class Armstrong_Number_Recursion{
	public static void main(String [] args)
	{
		System.out.print(sumofDigit(153,153,0));
	}
	public static boolean sumofDigit(int num , int temp , int sum)
	{
		if(temp==0)
		{
		return num==sum;
		}
		else
		{
			int ct = count(num,0);
			int pow = power(temp%10,ct);
			sum = sum + pow;
			return sumofDigit(num,temp/10,sum);
		}
	}
	public static int count(int num , int ct)
	{
		return num==0? ct: count(num/10,++ct);
	}
	public static int power(int base , int raise)
	{
		return raise==0? 1: base * power(base,raise-1);
	}
}