import java.util.Scanner;
 public class DuckNumber{
	public static void main(String [] args){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a Number:");
	String str = sc.next();
	boolean flag = false;
	for(char ch = 1; ch<str.length(); ch++)
	{
		
		if(str.charAt(ch)=='0')
		{
			flag = true;
		    break;
		}
		
	}
	if(flag)
		System.out.println(str+ " Is a Duck Number");
	else
		System.out.println(str+ " Is Not a Duck Number");
		
	}
 }
	