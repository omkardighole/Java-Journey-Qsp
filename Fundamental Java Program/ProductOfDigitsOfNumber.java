import java.util.Scanner;
public class ProductOfDigitsOfNumber{
	public static void main( String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num = sc.nextInt();
		int product = 1;
		int rem;
		
		rem = num%10;
		product *= rem;
		num /= 10;
		
		rem = num %10;
		product *= rem;
		num /=10;
		
		rem = num % 10;
		product = product * rem;
		num/=10;
		
		System.out.println("The product of the  Digits is : " +product);
	}
}
		