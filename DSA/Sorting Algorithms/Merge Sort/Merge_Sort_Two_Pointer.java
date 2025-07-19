package arrays;
import java.util.Arrays;

public class Merge_Sort_Two_Pointer {

	public static void main(String[] args) {
		
		int arr1[]= {5,15,18,20,55,60};
		int arr2[] = {2,3,12,18,25,32,50,63};
		System.out.println(Arrays.toString(merge(arr1,arr2)));

	}
	
	public static int [] merge(int a[] , int b [])
	{
		int ans [] =new int[a.length+ b.length];
		
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length)
		{
			if(a[i]<=b[j])
			{
				ans[k++]=a[i++];
				
			}
			else if(a[i]>b[j])
			{
				ans[k++]=b[j++];
			}
			while(i<a.length)
			{
				ans[k++]=a[i++];
			}
			while(j<b.length)
			{
				ans[k++]=b[j++];
			}
		}
		return ans;
	}

}
