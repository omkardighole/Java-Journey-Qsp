package arrays;

import java.util.Arrays;

public class Zig_Zag_Array {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,10,20,30};
		int arr2[]= {5,6,7,8};
		zigZag(arr1,arr2);
		
	}
	
	public static void zigZag(int arr1[],int arr2[])
	{
		int ans [] =new int[arr1.length+arr2.length];
		int min=0;
		
		if(arr1.length>arr2.length)
			min=arr2.length;
		else
			min=arr1.length;
		
		
		
				for(int i =0,k=0;k<ans.length;i++)
				{
					if(k<(2*min))
					{
						ans[k]=arr1[i];
						k++;
						ans[k]=arr2[i];
						k++;
					}
					else
					{
						if(min==arr1.length)
						{
							ans[k]=arr2[i];
							k++;
						}
						else {
							ans[k]=arr1[i];
							k++;
						}
					}
				}
		
		System.out.println(Arrays.toString(ans));
	}
}
	

