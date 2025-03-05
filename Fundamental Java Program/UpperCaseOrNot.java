import java.util.Scanner;
public class UpperCaseOrNot{
public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Character:");
	char ch = sc.next().charAt(0);
	
	String a = (ch>='A' && ch<='Z')? (ch + " is an Uppercase alphabet"): (ch+ "is an lowercase  alphabet" );
	
	System.out.println(a);
}
}
	