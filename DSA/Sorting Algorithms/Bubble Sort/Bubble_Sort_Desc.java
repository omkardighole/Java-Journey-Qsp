package arrays;

import java.util.Arrays;

public class Bubble_Sort_Desc {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,100};
		bubbleSort(arr);
		

	}
	public static void bubbleSort(int arr[])
	{int swap=0;
		for(int i =0;i<arr.length-1;i++) 
		{
		
			int temp=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{ swap++;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		System.out.println("The Array is Sorted using bubble sort in decending order: "+Arrays.toString(arr));
		System.out.println("The total swaps needed is : "+swap);
	}

}
