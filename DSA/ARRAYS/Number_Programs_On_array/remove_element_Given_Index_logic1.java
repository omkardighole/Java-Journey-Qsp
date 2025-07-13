package arrays;

import java.util.Arrays;

public class remove_element_Given_Index_logic1 {

	public static void main(String[] args) {


	int arr [] = {10,20,30,40,50,60};
	int index = 3;
	int ans [] = new int [arr.length-1];
	int j =0;
	for(int i = 0; i<arr.length;i++)
	{
		if(i==index)
		{
			continue;
		}
		else
		{
			ans[i]=arr[i];
			//j++;
		}
	}
	System.out.println(Arrays.toString(ans));

	}

}
