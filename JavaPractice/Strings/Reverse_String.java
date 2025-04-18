import java.util.Scanner;
class Reverse_String{

public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the String: ");
	String str = sc.nextLine();
	String temp = str;
	String rev ="";
	
	for(int i =0 ; i<str.length();i++)
	{
		rev = str.charAt(i)+rev;
	}
	System.out.println(rev);
	if(str.equals(rev))
	{
		System.out.println("Palindrome string ");
	}
	else
	{
		System.out.println("Not Palindrome string ");
	}
	
	
}
}