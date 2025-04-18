import java.util.Scanner;
public class Pattern7{
	public static void main(String [] args){
		int n = 4; 
		int a = 2;
		int row,col;
		
		for(row=1; row<=n; row++)
		{
			for(col = 1; col<=row; col++)
			{
				System.out.print(a+ " ");
					a+=2;
			}
			System.out.println();
		}
		
	}
}