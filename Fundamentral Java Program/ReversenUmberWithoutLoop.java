import java.util.Scanner;
public class ReverseNumberWithoutLoop{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		int duplicate = num;
		int rev=0;
		int rem;
		
		rem=num%10;
		rev=(rev*10)+rem;
		
		num=num/10;
		rem=num%10;
		rev=(rev*10)+rem;
		
		num=num/10;
		rem=num%10;
		rev=(rev*10)+rem;
		
		System.out.println(" The Reverse is :" +rev);
	}
}
		
		