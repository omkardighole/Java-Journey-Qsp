import java.util.Scanner;
public class EvenOddDivLogic2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		
		if((num/2)==(num/2.0)){
			System.out.println("Even Number");
		}
		
		else{
			System.out.println("Odd Number");
		};
		System.out.println(num/2);
		System.out.println(num/2.0);
	}
	
}