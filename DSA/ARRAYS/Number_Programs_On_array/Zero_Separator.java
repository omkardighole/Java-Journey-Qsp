package arrays;
import java.util.Arrays;

public class Zero_Separator {

	public static void main(String[] args) {
		
		int arr[]= {1,0,3,5,0,6,0,0,4,1};
		zero_Separator(arr);

	}
	
	public static void zero_Separator(int [] arr)
	{
		int i =0;  int j =arr.length-1;
		
		while(i<j)
		{
			while(arr[i]!=0)
			{
				i++;
			}
			while(arr[j]==0)
			{
				j--;
			}
			if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
