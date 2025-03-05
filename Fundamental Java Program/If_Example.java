import java.util.Scanner;
public class If_Example{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a Paid Student:");
		
		boolean ip = sc.nextBoolean();
		
		if(ip){
			System.out.println("pay the fees");
		};
		System.out.println("Sit in the Class");
	}
}