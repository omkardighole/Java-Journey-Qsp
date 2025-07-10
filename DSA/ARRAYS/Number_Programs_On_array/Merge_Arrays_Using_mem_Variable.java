package arrays;

import java.util.Arrays;

public class Merge_Arrays_Using_mem_Variable {

	public static void main(String[] args) {

		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {6, 7, 8, 9, 10};
		mergeArray(arr1, arr2);
		
		mergeLogic2(arr1,arr2);
	}

	public static void mergeArray(int arr1[], int arr2[]) {
		int mem = 0;
		int ans[] = new int[arr1.length + arr2.length]; // ✅ correct size

		for (int i = 0; i < arr1.length; i++, mem++) {
			ans[mem] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++, mem++) {
			ans[mem] = arr2[i];
		}

		System.out.println("Merging two arrays using the memory variable: " +Arrays.toString(ans));
	}
	
	public static void mergeLogic2(int arr1[],int arr2[])
	{
		int ans[]= new int[arr1.length+arr2.length];
		for(int i = 0 ; i<ans.length;i++)
		{
			if(i<arr1.length)
			{
				ans[i]=arr1[i];
			}
			else
			{
				ans[i]=arr2[i-arr1.length];
			}
		}
		System.out.println("Merging two arrays using the Single for loop best logic : " +Arrays.toString(ans));
	}
}
