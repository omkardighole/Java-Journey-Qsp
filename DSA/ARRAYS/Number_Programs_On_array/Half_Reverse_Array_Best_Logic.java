package arrays;

import java.util.Arrays;

public class Half_Reverse_Array_Best_Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		halfReverse(arr);

	}
	
	public static void halfReverse(int arr [])
	{  int [] ans =new int[arr.length];
		for(int i = 0,j=arr.length-1;i<arr.length;i++)
			
		{
			if(i<arr.length/2)
			{
				ans[i]=arr[i];
			}
			else
			{
				ans[i]=arr[j];
				j--;
			}
			
		}
		System.out.println(Arrays.toString(ans));
	}

}
