package strings;

public class Revere_String {

	public static void main(String[] args) {

		String str = " OMKAR ";
		reverse_String( str);

	}
	
	public static void reverse_String(String str)
	{
		String rev="";
		
		for(int i = str.length()-1 ; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

}
