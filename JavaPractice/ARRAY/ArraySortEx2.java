import java.util.Scanner;
import java.util.Arrays;
public class ArraySortEx2{
	public static void main(String [] args)
	{	Scanner sc = new Scanner(System.in);
		int a = 3 , b = 3;
	int arr[][] = new int [a][b];
	System.out.println("Enter the Elements in array: " );
	for(int i = 0 ; i<a;i++)
	{
		for(int j = 0 ; j < b ; j++)
		{
			arr[i][j]=sc.nextInt();
		}
		System.out.println();
	}
	for(int i = 0 ; i<a;i++)
	{
		for(int j = 0 ; j < b ; j++)
		{
			System.out.print(arr[i][j]+"  ");
		}
		System.out.println();
	}
	
	}
}