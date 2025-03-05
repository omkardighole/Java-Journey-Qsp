import java.util.Scanner;
public class DigitsSum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 3 digit nUmber:");
		int num = sc.nextInt();
		int sum = 0;
		
		int rem = num % 10;
		sum +=rem;
		num /=10;
		
		rem = num % 10;
		sum +=rem;
		num /=10;
		
		rem= num % 10;
		sum +=rem;
		num /= rem;
		
		System.out.println("The Sum of digits is :" +sum);
	}
	
}
		
		