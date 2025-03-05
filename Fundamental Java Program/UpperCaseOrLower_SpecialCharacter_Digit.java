import java.util.Scanner;
public class UpperCaseOrLower_SpecialCharacter_Digit{
public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Character:");
	char ch = sc.next().charAt(0);
	
	String a = ((ch>='A' && ch<='Z') || (ch>= 'a' && ch<='z'))? ((ch>= 'a' && ch<='z')?(ch+ "is an Lowercase alphabet") :(ch+ "Is an Uppercase Aplhabet")) : ((ch>='0' && ch<= '9')? (ch+ ("is an digit"):(ch+ (Is an special character"));
	
	
	System.out.println(a);
}
}
	