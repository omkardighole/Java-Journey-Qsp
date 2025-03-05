import java.util.Scanner;
public class While_Example1{
	public static void main(String [] args){
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the no till you want to print numbers from 1 :");
		int end = sc.nextInt();
		
		int i = 0;
		while(i<=end){
			System.out.println(i);
			i++;
		}
	}
}
