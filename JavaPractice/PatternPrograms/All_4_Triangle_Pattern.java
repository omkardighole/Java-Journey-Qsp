public class All_4_Triangle_Pattern{
	public static void main(String [] args){
		int n = 12;
		//Pattern 1
		for(int row = 1; row<=n ; row++)
		{
			for(int space=1; space<=(n-row); space++)
			{
				System.out.print(" ");
			}
			for(int star=1; star<=row; star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			System.out.println();
			
			//Pattern 2
			//just remove space 
			
			for(int row = 1; row<=n ; row++)
		{
			for(int space=1; space<=(n-row); space++)
			{
				System.out.print("");
			}
			for(int star=1; star<=row; star++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		//Pattern 3
		//start a reverse loop
		//inverted triangle prints
		
		
		for(int row = n; row>=1 ; row--)
		{
			for(int space=1; space<=(n-row); space++)
			{
				System.out.print(" ");
			}
			for(int star=1; star<=row; star++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println();
		
		//Pattern 4
		
		//remove the space 
		
		for(int row = n; row>=1 ; row--)
		{
			for(int space=1; space<=(n-row); space++)
			{
				System.out.print("");
			}
			for(int star=1; star<=row; star++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
}