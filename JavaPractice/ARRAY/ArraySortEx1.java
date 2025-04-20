import java.util.Scanner;
import java.util.Arrays;
public class ArraySortEx1{
	public static void main(String [] args)
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elemts: ");
		int arr[] = new int[5];
		
		for(int i = 0 ; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}
}