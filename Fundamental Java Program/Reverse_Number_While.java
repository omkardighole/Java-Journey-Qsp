import java.util.Scanner;
public class Reverse_Number_While{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = sc.nextInt();
		int rev=0;
		while (num>0){
			rev=rev*10+(num%10);
			num/=10;
		}
		System.out.println(num+"the Reverse of this Number is: " +rev);
	}
}