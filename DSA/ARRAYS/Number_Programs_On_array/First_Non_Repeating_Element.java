package arrays;

import java.util.Arrays;

public class First_Non_Repeating_Element {

	public static void main(String[] args) {

		int arr [] = {1,2,3,4,3,2,1,5,6,5,6,7,6,8,5,9};
		firstNon_Repeating(arr);
		

	}
	
	public static void firstNon_Repeating(int arr[])
	{
		int freq[]=freq(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			if(freq[i]==0)
			{
				System.out.println("The first non repeating digit is : "+arr[i]);
				break;
			}
		}
	}
	
	public static int[] freq(int arr [] )
	{	int count []= new int[arr.length];
		for(int i =0; i<arr.length;i++)
		{
			int cnt =0;
			for(int j =i+1 ; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count[j]=-1;
					cnt++;
				}
			}
			count[i]=cnt;
		}
		return count;
	}

}
