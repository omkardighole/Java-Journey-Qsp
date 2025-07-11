package arrays;

import java.util.Arrays;

public class To_Even_Array_Covert {

	public static void main(String[] args) {
		
		int [] arr = {46,78,23,9,98,6,3287,6,23,65,7,47};
		evenArray(arr);

	}
	
	public static void evenArray(int [] arr)
	{	int [] even =new int[arr.length];
		for(int i = 0; i<arr.length;i++)
		{	if(isEven(arr[i]))
			even[i]=arr[i];
		else {
			if(isEven(arr[i]+1))
				even[i]=arr[i]+1;
		}
			
		}
		System.out.println("The Even array is :"+Arrays.toString(even));
	}
	
	public static boolean isEven(int n)
	{
		if(n%2==0)
		{
			return true;
		}
		return false;
	}

}
