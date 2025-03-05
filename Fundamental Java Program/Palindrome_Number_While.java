import java.util.Scanner;
public class Palindrome_Number_While{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = sc.nextInt();
		int rev=0;
		int temp = num;
		while (num>0){
			rev=rev*10+(num%10);
			num/=10;
		}
		String ans =(temp==rev)?(temp+ " is a palindrome  = " +rev):(temp+ " Is not a Palindrome Number");
		System.out.println(ans);
	}
}