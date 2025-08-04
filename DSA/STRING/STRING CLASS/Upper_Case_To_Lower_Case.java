package strings;

public class Upper_Case_To_Lower_Case {

	public static void main(String[] args) {
		String str = " ABC ";
		 upper_lower( str);

	}
	
	public static void upper_lower(String str)
	{ String temp="";
		for(int i = 0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='A'  && ch<='Z')
			{
				
				temp=temp+(char)(ch+32);
			}
			else if(ch>='a'  && ch<='z')
			{
				temp =temp + ch;
			}
			else
			{
				temp=temp+ch;
			}
		}
		System.out.println("The Updated String is : "+temp);
	}

}
