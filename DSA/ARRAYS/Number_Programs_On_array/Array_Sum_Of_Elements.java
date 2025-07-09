package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Array_Sum_Of_Elements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		int size=sc.nextInt() ;
		int [] arr = new int[size];
		for(int i = 0 ; i<size ; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The Sum Of the elements of array is : "+arraySum(arr));

	}
	
	public static int arraySum(int [] arr)
	{
		int sum = 0;
		for(int i = 0; i<arr.length; i++)
		{
			sum+=arr[i];
		}
		return sum;
	}

}
