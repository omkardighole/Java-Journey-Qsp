package strings;

public class Replace_Only_First_Occurence {

	
	public static void main(String[] args) {
		String str = " Omakar ";
		replace(str,'a','@');

	}
	
	public static void replace(String str , char old , char neww)
	{
		String temp="";
		boolean flag=true;
	
	
			
		for(int i =0 ; i<str.length();i++)
		{	char ch = str.charAt(i);
		
			if(ch==old  && flag)
			{
				temp+=neww;
				flag = false;
				
			}
			else
			{
				temp+=ch;
			}
		}
		System.out.println(temp);
	}

}
