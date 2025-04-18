import java.util.Scanner;
class ArrExample1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  the size of array:");
		int size = sc.nextInt();
		int marks [] =new int[size];
		System.out.print("Enter  the marks in array:");
		for(int i = 0 ; i<size; i++)    //input
		{
			marks[i] =sc.nextInt();
		}
		for(int i = 0; i<marks.length;i++)
		{
			System.out.println("The array is :" +marks[i]);
		}
	}
}
