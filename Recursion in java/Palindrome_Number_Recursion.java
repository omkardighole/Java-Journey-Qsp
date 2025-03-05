class Palindrome_Number_Recursion{
	public static void main(String [] args)
	{
		System.out.print(reverse(121,121,0));
	}
	
public static boolean reverse(int num , int temp , int rev)
{
	if(temp==0)
	{
		return num == rev;
	}
	else
	{
		rev = rev * 10 + (temp % 10);
		return reverse (num , temp/10 , rev);
	}
}
}