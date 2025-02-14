import java.util.Scanner;
public class While_Example2{
	public static void main(String [] args){
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the no till you want to print numbers from Bigger  :");
		int end = sc.nextInt();
		System.out.print("Enter the no till you want to print numbers from Bigger to Smaller :");
		int i = sc.nextInt();
		while(i<=end){
			System.out.println(i);
			i++;
		}
	}
}
