package arrays;
import java.util.Arrays;

public class Half_Reverse_Array {

	public static void main(String[] args) {
		int arr [] = { 1,2,3,4,5,6};
		int res [] = halfReverse(arr);
		System.out.println(Arrays.toString(res));

	}
	
	public static int[] halfReverse(int [] arr)
	{int rev [] = new int[arr.length];
		if(arr.length/2==0)
		{
			for(int i =arr.length/2,j=arr.length-1;i<arr.length;i++,j--)
			{
				arr[arr.length-i-1]=arr[i];
			}
		}
		else 
		{
			for(int i =(arr.length/2)+1,j=arr.length-1;i<arr.length;i++,j--)
			{
				arr[arr.length-i-1]=arr[i];
			}
		}
		return arr;
	}

}
