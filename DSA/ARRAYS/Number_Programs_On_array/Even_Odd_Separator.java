package arrays;
import java.util.Arrays;

public class Even_Odd_Separator {

	public static void main(String[] args) {

		int [] arr = {2,3,4,5,6,7,8,9,10};
		even_Odd_Separate(arr);

	}
	
	public static void even_Odd_Separate(int [] arr)
	{
		int i = 0;  int j = arr.length-1;
		
		while(i<j)
		{
			while(arr[i]%2>=1)  //move forward if arr[i] is odd			{
				i++;
			}
			while(arr[j]%2==0)//move reverse in array if arr[j] even 
			{
				j--;
			}
			
			if(i<j)
			{
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}


