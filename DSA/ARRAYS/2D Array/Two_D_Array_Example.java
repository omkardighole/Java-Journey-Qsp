package Two_D_Arrays;
import java.util.Scanner;

public class Two_D_Array_Example {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int arr[][]= new int[3][3];
		System.out.println("Enter the Elements in an array: ");
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=0 ; j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+ "  ");
			}
			System.out.println();
		}

	}

}
