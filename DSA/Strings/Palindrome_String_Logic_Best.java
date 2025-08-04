package strings;

public class Palindrome_String_Logic_Best {

	public static void main(String[] args) {

		String str = " MADAM ";
		
		int i;
		for( i = 0 ; i<str.length()-1;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
			{
				break;
			}
		}
		
		if(i>=str.length()/2)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		

	}

}
