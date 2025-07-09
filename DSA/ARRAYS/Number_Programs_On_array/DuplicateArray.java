package arrays;
import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int [] arr= {54,12,56,87,45,12};
		duplicateArr(arr);
	}
	
	public static void duplicateArr(int []arr)
	{
		int [] dup = new int[arr.length];
		
		for(int i = 0;i<arr.length;i++)
		{
			dup[i]=arr[i];
		}
		System.out.println("The Duplicate Array is : "+Arrays.toString(dup));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~``");
		
		System.out.print("The Array printed using for loop : ");
		for(int i = 0 ; i<arr.length;i++ )
		{
			
			System.out.print(+dup[i]+ " ");
		}
		
	}

}
