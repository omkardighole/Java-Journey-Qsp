package strings;

public class LowerCase_UpperCase {

	public static void main(String[] args) {
		
		String str = "abc";
		lower_Upper(str);
	}
	public static void lower_Upper(String str)
	{ String temp="";
		for(int i = 0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='A'  && ch<='Z')
			{
				temp =temp + ch;
				
			}
			else if(ch>='a'  && ch<='z')
			{
				
				temp=temp+(char)(ch-32);
			}
			else
			{
				temp=temp+ch;
			}
		}
		System.out.println("The Updated String is : "+temp);
	}
}
