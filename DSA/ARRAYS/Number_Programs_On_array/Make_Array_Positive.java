package arrays;

import java.util.Arrays;

public class Make_Array_Positive {

	public static void main(String[] args) {
		
		int arr [] = {1,-2,7,65,-78,-32,12,-8};
		positive(arr);

	}
	
	public static void positive(int [] arr)
	{	int pos [] = new int[arr.length];
		for(int i = 0 ; i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				pos[i]=(arr[i]*(-1));
			}
			else
			{
				pos[i]=arr[i];
			}
		}
		System.out.println(Arrays.toString(pos));
	}

}
