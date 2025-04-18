import java.util.Scanner;
class LinearSearch_Array{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of arry:");
		int size = sc.nextInt();
		int numbers [] =new int [size];
		//input
		System.out.print("Enter the elements in  arry:");
		for(int i = 0; i < size ; i++)
		{
			numbers[i] = sc.nextInt();
		}
		
		System.out.print("Enter the X element to find its index in arry:");
		int x = sc.nextInt();
		
		//outpuyt
		for(int i = 0 ; i<numbers.length; i++)
		{
			if(numbers[i]==x)
			{
				System.out.print("The xth element found at index:" +i);
			}
		}
	}
}