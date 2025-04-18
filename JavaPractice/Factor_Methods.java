public class Factor_Methods{
	public static void main(String [] args){
		factor(10);
	}
	
	public static void factor(int n)
	{
		for(int i = 1 ; i<=n ; i++)
		{
			if( n%i==0)
				System.out.print( i+ "  ");
			else
				continue;
			
			
		}
	}
}