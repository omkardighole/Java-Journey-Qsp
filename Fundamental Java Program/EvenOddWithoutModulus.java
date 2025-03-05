import java.util.Scanner;
public class EvenOddWithoutModulus{
	public static void main(String [] args){
		System.out.println("Enter a no.:");
		int num=new Scanner(System.in).nextInt();
		int i=1;
		i+=2;
		while(i<=num){
			System.out.println("Odd");
		};
		System.out.println("Even");
	}
}