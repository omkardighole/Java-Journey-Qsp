package arrays;

import java.util.Arrays;

public class Remove_Elements_Other_Than_Ocurrence {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,30,50,6,30,30,30,70,90};
		int cnt =0;
		int ele=30;
		
		for(int i =0 ; i<arr.length ; i++)
		{
			if(ele==arr[i])
			{
				cnt++;
			}
		}
		remove(arr,cnt,ele);
		

	}
	public static void remove(int []arr , int cnt,int ele)
	{
		int ans [] = new int[cnt];
		
		for(int i= 0,j=0; i<arr.length;i++)
		{
			if(ele==arr[i])
			{
				ans[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(ans));
		
	}

}
