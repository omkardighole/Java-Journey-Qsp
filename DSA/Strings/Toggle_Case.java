package strings;

public class Toggle_Case {

	public static void main(String[] args) {
		
		String str = " oMkAr@123 ";
		toggle_Case(str);

	}
	
	public static void toggle_Case(String str )
	{
		String temp = "";
		
		for(int i = 0 ; i < str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='A'  && ch<='Z')
			{
				temp = temp +(char)(ch+32);
			}
			else if(ch>='a'  && ch<='z')
			{
				temp = temp + (char)(ch-32);
			}
			else
			{
				temp = temp+ch;
			}
		}
		System.out.println("The toggle Case of the given String is :  " +temp);
	}

}
