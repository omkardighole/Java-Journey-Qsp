package arrays;

import java.util.Arrays;

public class Reverse_Array_using_Same_array {

	public static void main(String[] args) {

		int arr [] = {1,2,3,4,5,6,7,8,9,10};
		rev(arr);

	}
	
	public static void rev(int [] arr)
	{int temp;
		for(int i = 0,j=arr.length-1; i<arr.length/2;i++,j--)
		{
			
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		System.out.println("The Array is Reversed without using A new array: " +Arrays.toString(arr));
		
	}

}
