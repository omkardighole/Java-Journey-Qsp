package strings;

public class Replace_All_Char {

	public static void main(String[] args) {
		String str = " Omakar ";
		replace(str,'a','@');

	}
	
	public static void replace(String str , char old , char neww)
	{
		String temp="";
		
		for(int i =0 ; i<str.length();i++)
		{	char ch = str.charAt(i);
			if(ch==old)
			{
				temp+=neww;
			}
			else
			{
				temp+=ch;
			}
		}
		System.out.println(temp);
	}

}
