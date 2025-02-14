import java.util.Scanner;
public class PrimeNumberConditionalOpertaor{
	public static void main(String [] args){
		System.out.print("Enter Number:");
		Scanner sc = new Scanner( System.in);
		
		int num = sc.nextInt();
		
		System.out.println( (num==2 || num==3)  ? (num+ "prime") : ((num%2==0 || num%3==0) ? (num+ " Not prime"):(num+ "prime")));
	}
}