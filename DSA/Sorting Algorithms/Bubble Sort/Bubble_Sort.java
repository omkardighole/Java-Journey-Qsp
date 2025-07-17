package arrays;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		int arr[]= {100,20,3,1,-8};
		int sort[] =bubbleSort(arr);
		System.out.println(Arrays.toString(sort));

	}
	public static int [] bubbleSort (int arr[])
	{
		for(int i =0;i<arr.length-1;i++)
		{
			int temp=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

}
