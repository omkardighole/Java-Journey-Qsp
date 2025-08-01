package strings;

public class Palindrome_String {

	public static void main(String[] args) {

		String str = " MADAM ";
		if( reverse_String( str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		

	}
	
	public static boolean reverse_String(String str)
	{
		String rev="";
		String temp = str;
		
		for(int i = str.length()-1 ; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		return temp.equals(rev);
	}

}
