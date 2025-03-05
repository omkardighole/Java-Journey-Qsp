import java.util.Scanner;
public class Hifi{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Number:");
	int num = sc.nextInt();
	String ans = (((num % 2==0 && num%5==0)? ("Hifi hi two"):((num % 2==0)? ("hi two"):(((num%5==0)? ("Hi five") :( " " ))))));
	
	System.out.println(ans);
	}
}