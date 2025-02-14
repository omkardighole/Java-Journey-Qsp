import java.util.Scanner;
public class Factorial_Of_Digit_Of_Number_Addition_Of_Them{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = sc.nextInt();    //123
		int rem;
		int fact = 1;
		int sum = 0;
		while(num>0){
			rem = num%10;   // rem = 3
			
			  for(int i = 1; i<=rem ; i++){
				  fact*=i;
			  }
			  sum+=fact;
			  
			System.out.println("The factorial of digit  " +rem+ " is " +fact);
			num/=10;    //12   it is Updation of while loop 
			fact = 1;
		
		}
		
		System.out.println("\n The Sum of all Digits Factorial is " +sum);
	}
}
			
			
			
		
		