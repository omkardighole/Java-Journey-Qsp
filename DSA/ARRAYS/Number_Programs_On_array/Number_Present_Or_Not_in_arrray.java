package arrays;
import java.util.Scanner;

public class Number_Present_Or_Not_in_arrray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find in an array : ");
		int x = sc.nextInt();
		int arr[]= {1,2,3,4,5,6,7,8,91,12,13,14,15,16,17,18,19,20,78,4561,2,68,45,53,98,4529,28,39,28,898};
		System.out.println("The Number is "+find(arr,x));
		
		System.out.println("Index: "+index(arr,x));
		

	}
	public static String find(int []arr,int x)
	{
		for(int i = 0; i<arr.length ; i++)
		{
			if(x==arr[i])
				return "Present";
		}
		return "Not Present";
		
	}
	public static int index(int []arr,int x)
	{
		for(int i = 0; i<arr.length;i++) 
		{
			if(arr[i]==x)
			{
				return i;
			}
			
		}
		return -1;
	}
	
	}


