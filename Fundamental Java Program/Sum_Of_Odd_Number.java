import java.util.Scanner;
public class Sum_Of_Odd_Number{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = sc.nextInt();
		int sum = 0;
		int rem = 0;
		
		while(num>0){
			rem=num%10;
			if(rem%2!=0){
				sum+=rem;
			}
			
			num/=10;
			
			
		}
		
		System.out.println("Sum of Even Numbers of given number is  " +sum);
	}
}