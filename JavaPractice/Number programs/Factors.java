public class Factors{
	public static void main(String [] args)
	{
		factor(12);
	}
	
	public static void  factor(int n)
	{	int count = 0;
		for(int i = 1 ; i<=n ; i++)
		{
			if(n%i==0)
			{
				count++;
				System.out.print(" " + i + "  ");
			}
		}
	}
}			