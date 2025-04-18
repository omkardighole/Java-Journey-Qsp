import java.util.Scanner;
public class Pattern5{
	public static void main(String [] args){
		int a = 4;
		char ch = 'a';
		for(int i = 1; i<=a;i++)
		{	
			for(int j = 1; j<=i ; j++)
			{
					System.out.print(ch + " ");
					ch++;
			}
			System.out.println();
			
		}
	}
}