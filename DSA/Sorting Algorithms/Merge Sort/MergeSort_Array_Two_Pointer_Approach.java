package arrays;

import java.util.Arrays;

public class MergeSort_Array_Two_Pointer_Approach {

public static void main(String[] args) {
		
		int arr1[]= {2,5,15,18,20,55,60};
		int arr2[] = {3,12,18,25,32,50,63};
		//int [] m=merge(arr1,arr2);
		int [] m= {2,5,15,18,20,55,60,3,12,18,25,32,50,63};
		
		System.out.println(Arrays.toString(mergeSort(m)));
		

	}

	public static int [] mergeSort(int [] a)
	{
		int ans [] =new int [a.length];
		int i=0,j=a.length/2 , k=0;
		
		while(i<a.length/2 && j<a.length)
		{
			if(a[i]<=a[j])
			{
				ans[k++]=a[i++];
				
			}
			else if(a[i]>a[j])
			{
				ans[k++]=a[j++];
			}
		}
		
			while(i<a.length/2)
			{
				ans[k++]=a[i++];
			}
			
		
		return ans;
		}

		
	
//	public static int [] merge(int a[] , int b [])
//	{
//		int ans [] =new int[a.length+ b.length];
//		
//		int i=0,j=0,k=0;
//		
//		while(i<a.length && j<b.length)
//		{
//			if(a[i]<=b[j])
//			{
//				ans[k++]=a[i++];
//				
//			}
//			else if(a[i]>b[j])
//			{
//				ans[k++]=b[j++];
//			}
//			while(i<a.length)
//			{
//				ans[k++]=a[i++];
//			}
//			while(j<b.length)
//			{
//				ans[k++]=b[j++];
//			}
//		}
//		return ans;
//	}

}
