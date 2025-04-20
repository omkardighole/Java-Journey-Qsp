import java.util.Scanner;

public class StringPalindrome{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter the String : ");
		
		String str = sc.nextLine().toUpperCase();
		String rev = "";
		for(char i = 0; i<str.length() ; i++)
		{
			rev =  str.charAt(i) + rev;
		}
		
		String ans = str.equals(rev)? ("Palindrome"):("Not Palindrome");
		System.out.println(ans);
	}
}
