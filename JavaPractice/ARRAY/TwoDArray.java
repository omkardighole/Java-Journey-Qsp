import java.util.Scanner;
class TwoDArray{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter teh size of 2d array :");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][]=new int[row][col];
		 
		System.out.print("Enter teh elements in array:");
		
		for(int i = 0 ; i<row;i++)
		{
			for(int j = 0 ; j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		//for output
		for(int i = 0; i<row ; i++)
		{
			for(int j = 0; j<col; j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}