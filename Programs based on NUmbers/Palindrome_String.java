import java.util.Scanner;
public class Palindrome_String{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String to check Palindrome or Not :");
		String str = sc.nextLine().toUpperCase();
		String temp = str;
		String rev="";
		
		for(int i=0; i<str.length();i++){
			rev = str.charAt(i)+rev;
		}
		String ans = (temp.equals(rev))?(temp+ " = " +rev+ "  It is a Palindrome"):(temp+ " = " +rev+ "  It is NOT  a Palindrome");
	System.out.println(ans);
	
	}
}