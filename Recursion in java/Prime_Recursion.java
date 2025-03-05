public class Prime_Recursion{
	public static void main(String [] args)
	{
		System.out.println(isPrime(9,2));
	}
	public static boolean isPrime(int num , int den)
	{
		if(num==den)
		{
			return true;
		}
		else if(num%den==0)
		{
			return false;
		}
		return isPrime(num ,++den);
	}
}