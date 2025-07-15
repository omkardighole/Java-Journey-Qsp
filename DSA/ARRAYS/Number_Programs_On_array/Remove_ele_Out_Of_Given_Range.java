package arrays;

import java.util.Arrays;

public class Remove_ele_Out_Of_Given_Range {

	public static void main(String[] args) {

		int arr []= {10,20,30,40,50,60,70,80};
		int start =3;
		int end = 6;
		remove(arr,start,end);


	}
	
	public static void remove(int [] arr,int start ,int end)
	{	int ans [] = new int [arr.length-(end-start)-1];
		if(start<end && start>=0 && end<arr.length)
		{
			for(int i = 0,j=0; i<arr.length;i++)
			{
				if(i>=start && i <=end)
				{
					ans[j]=arr[i];
					j++;
				}
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}
