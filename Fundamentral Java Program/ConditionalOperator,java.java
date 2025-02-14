import java.util.Scanner;
public class ConditionalOperator{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a numbe rto check even or odd :");
		
		int num =sc.nextInt();
		
		String ans = num%2==0 ? "even" : "Odd" ;
		
		System.out.println("The Number is " +ans);
	}
	
}