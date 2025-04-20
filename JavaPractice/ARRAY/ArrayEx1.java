import java.util.Scanner;
public class ArrayEx1{
	public static void main(String [] args)
	{	Scanner sc = new Scanner(System.in);
		//int [] arr = new int[2];
		//arr[0]=10;
	//	arr[1]=15;
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		
		int [] arr = new int[size ];
		System.out.println("Enter the elements of array:");
		
		for(int i = 0 ; i<arr.length ; i++)
		{
			 arr[i] = sc.nextInt();
		}
	for(int i = 0 ; i<arr.length; i++)
		System.out.print(arr[i]+ "   ");
	
		System.out.println("Entera number to find in the  array:");
		int x = sc.nextInt();
		
		for(int i = 0 ; i <arr.length ; i++)
		{
			if(arr[i]==x)
			{
				System.out.println("index :" +i);
			}
			
		}
	}
	
	}
