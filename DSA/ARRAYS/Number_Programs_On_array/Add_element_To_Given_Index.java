package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Add_element_To_Given_Index {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number to add in an array: ");
		int ele = sc.nextInt();
		System.out.print("Enter an index Where to add an element :");
		int index = sc.nextInt();
		int arr [] = {1,2,3,4,5,6,7,8,9};
		
		
		if(index>=0 && index<arr.length-1)
		{
		int ans [] = new int[arr.length+1];
		for(int i =0;i<ans.length;i++)
		{
			
		
		
			 
			if(i < index)
			{
				ans[i]=arr[i];
			}
			else if(i==index)
			{
				ans[i]=ele;
			}
			else
			{
				ans[i]=arr[i-1];
			}
		}
		System.out.println(Arrays.toString(ans));
	}
		else System.out.println("Index is not present ");
		
				

	}

}
