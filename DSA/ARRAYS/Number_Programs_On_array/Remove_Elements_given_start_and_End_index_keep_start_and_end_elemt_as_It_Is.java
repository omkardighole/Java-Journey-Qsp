package arrays;

import java.util.Arrays;

public class Remove_Elements_given_start_and_End_index_keep_start_and_end_elemt_as_It_Is {

	public static void main(String[] args) {

		int [] arr = { 10,20,30,40,50,60,70,80,90};
		int index_Start=2;
		int index_End = 5;
		remove(arr,index_Start,index_End);

	}
	
	public static void remove(int arr[] , int index_Start , int index_End)
	{ int ans [] = new int[arr.length-(index_End-index_Start+1)];
		for(int i=0,j=0;i<arr.length;i++)
		{
			if(i>=index_Start && i<=index_End)
			{
				continue;
			}
			else 
			{
				ans[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}
