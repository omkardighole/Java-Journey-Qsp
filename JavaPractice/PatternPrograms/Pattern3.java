import java.util.Scanner;
public class Pattern3{
	public static void main(String [] args){
		int a = 4;
		int n=1;
		for(int i = 1; i<=a;i++)
		{
			for(int j = 1; j<=i ; j++)
			{
					System.out.print(n +"  ");
					n++;
			}
			System.out.println();
			
		}
	}
}