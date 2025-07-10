package arrays;

import java.util.Arrays;

public class Left_Half_reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		halfReverse(arr);

	}
	
	public static void halfReverse(int arr [])
	{  int [] ans =new int[arr.length];
		
		for( int i =0,j=arr.length/2-1;i<arr.length;i++)
		{
			if(i<arr.length/2)
			{
				ans[i]=arr[j];
				j--;
			}
			else {
				ans[i]=arr[i];
			}
		}
	
		System.out.println(Arrays.toString(ans));
	}

}


