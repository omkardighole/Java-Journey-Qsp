import java.util.Scanner;
public class TwoDArrray_Search{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter the row and columns of array:");
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		int number[][] = new int[row][col];
		
		System.out.print("Eneter the elements of array:");
		for(int i = 0; i<row; i++)
		{
			for(int j = 0 ; j<col;j++)
			{
				number[i][j]=sc.nextInt();
			}
		}
		
		System.out.print("Eneter the X th element to find inthe  array:");
		int x = sc.nextInt();
		
		for(int i= 0; i<row; i++)
		{
			for(int j = 0; j<col; j++)
			{
				if(number[i][j]==x)
				{
					System.out.println("number found at index :" +i+ " , " +j );
				}
			}
		}
	}
}