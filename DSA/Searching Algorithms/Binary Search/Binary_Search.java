package arrays;
import java.util.Arrays;

public class Binary_Search {

	public static void main(String[] args) {
		int arr [] = {11,2,45,1,0,58,50};
		int [] sorted =Bubble_Sort.bubbleSort(arr);
		System.out.println(Arrays.toString(sorted));
		binary_Search(sorted,50);                                                      
		
	}

	public static void binary_Search(int [] arr,int search)
	{
		int start=0 , end =arr.length-1 ,mid=(start+end)/2;
		
		while(start<=end)
		{
			if(arr[mid]==search)
			{
				System.out.println("Element found at : "+mid);
				break;
			}
			else if(search>arr[mid])
			{
				start=mid+1;
			}
			else if(search<arr[mid])
			{
				end=mid-1;
			}
		 mid=(start+end)/2;
			}
		if(start>end)
		{
			System.out.println("Element Not Found");
		}
	}
}
