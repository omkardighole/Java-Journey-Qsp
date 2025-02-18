import java.util.Scanner;
public class Pattern4{
	public static void main(String [] args){
		int a = 4;
		
		for(int i = 1; i<=a;i++)
		{	char ch = 'a';
			for(int j = 1; j<=i ; j++)
			{
					System.out.print(ch + " ");
					ch++;
			}
			System.out.println();
			
		}
	}
}