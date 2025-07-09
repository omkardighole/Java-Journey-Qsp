package arrays;
import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		
		int [] arr= {10,20,30,40,50};
		int [] arr2 = reverseArray(arr);
		System.out.println(Arrays.toString(arr2));
	}
	public static int[] reverseArray(int [] arr)
	{
		int [] rev = new int[arr.length];
		//for(int i =arr.length-1;i>=0;i--)  this also works
//		{
//			rev[arr.length-i-1]=arr[i];
//		}
		
		for(int i = 0;i<arr.length;i++)
		{
			rev[arr.length-1-i]=arr[i];
		}
		return rev;
	}
	
}
