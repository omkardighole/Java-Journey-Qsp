import java.util.Scanner;
public class Largest_Smallest_Number_ConditionalOperator{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1 :");
		int num1 = sc.nextInt();
		System.out.print("Enter number 2 :");
		int num2 = sc.nextInt();
		System.out.print("Enter number 3 :");
		int num3 = sc.nextInt();
		
		int largest = (num1 > num2) ? ((num1 > num3 )? (num1):(num3)) :  ((num2 > num3)? (num2) : (num3));
		
		System.out.println("The Largest Number Among The Three Numbers Is : " +largest);
		
		int smallest = (num1<num2) ? ((num1<num3) ? (num1) : (num3)) : ((num2<num3) ? (num2) : (num3));
		
		System.out.println("The Smallest Number Among The Three NUmbers is :  " +smallest);
	}
}