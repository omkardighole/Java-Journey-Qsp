package arrays;

import java.util.Arrays;

public class Remove_Index_Array_Sir_Logic {

	public static void main(String[] args) {
		
		int arr [] = { 10,20,30,40,50,60};
		int index =  4;
		removeIndex(arr,index);

	}
	
	public static void removeIndex(int arr [] ,int index)
	{	int ans [] = new int [arr.length-1];
		for(int i = 0; i<arr.length;i++)
		{
			if(i<index)
			{
				ans[i]=arr[i];
			}
			else if(i>index)
			{
				ans[i-1]=arr[i];
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}
