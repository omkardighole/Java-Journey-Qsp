package arrays;

import java.util.Arrays;

public class Negative_Positive_Seperator {

	public static void main(String[] args) {
		
		int arr [] = { -1,-2,3,5,-8,912,78,45,21,-2,-98,-56,-845,65,-23,74};
		negativePositive_Separate(arr);

	}
	
	public static void negativePositive_Separate(int arr [])
	{int ans [] = new int [arr.length];
		for(int i = 0,j=arr.length-1,k=0; i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				ans[k]=arr[i];
				k++;
				
			}
			else
			{    ans[j]=arr[i];
			     j--;
				
				
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}
