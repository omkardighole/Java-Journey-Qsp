package arrays;

import java.util.Arrays;

public class Remove_Ele_Range {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(removeRange(arr,2,5)));
		

	}
	
	public static int [] removeRange(int [] arr , int start, int end)
	{
		if(start >= 0 && end <arr.length && start < end )
		{
			int [] ans = new int [arr.length-(end-start)];
			for(int i =0; i<arr.length; )
			{
				if(i<start)
				{
					ans[i]=arr[i];
					i++;
				}
				else if(i==start)
				{
					i+=(end-start);
				}
				else if(i>=end)
				{
					ans[i-(end-start)]=arr[i];
					i++;
				}
				
			}
			return ans;
		}
		return null;
	}

}
