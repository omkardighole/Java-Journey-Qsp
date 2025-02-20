import java.util.Scanner;
public class FibonacciSeries{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Range:");
		int range = sc.nextInt();
		int a=-1;
		int b = 1;
		int temp;
		for(int i =1 ; i<=range;i++)
		{	
			temp=a+b;
			System.out.print(temp+ "  ");
			a=b;
			b=temp;
		}
	}
}
				