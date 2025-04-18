import java.util.Scanner;
public class Pattern6{
	public static void main(String [] args){
		int a = 4;
		char ch = 'a';
		for(int i = 1; i<=a;i++)
		{	
			for(int j = 1; j<=i ; j++)
			{	
				if((i+j)%2==0)
				{
					System.out.print("1 ");
				
				}
				else
				{	System.out.print("0 ");
				}
			}
			System.out.println();
			
		}
	}//follow odd even pattern by adding i + j
}