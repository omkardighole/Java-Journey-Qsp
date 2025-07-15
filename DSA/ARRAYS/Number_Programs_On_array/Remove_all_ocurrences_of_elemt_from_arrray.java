package arrays;

import java.util.Arrays;

public class Remove_all_ocurrences_of_elemt_from_arrray {

	public static void main(String[] args) {
		
		int [] arr  = { 10,20,30,30,30,40,50,30,60,30,70};
		int ele=30;
		int cnt =count(arr,ele);
		removeDuplicate(arr,ele,cnt);

	}
	public static int count(int arr [],int ele )
	{
		int cnt = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			cnt++;
		}
		return cnt;
	}
	
	public static void removeDuplicate(int arr[] , int ele, int cnt) {
	    int[] ans = new int[arr.length - cnt];
	    for (int i = 0, j = 0; i < arr.length; i++) {
	        if (arr[i] != ele) {
	        	ans[j] = arr[i];
	            j++; 
	        } 
	        else continue;
	    }
	    System.out.println(Arrays.toString(ans));
	}


}
