package strings;

public class Password_Validation_Flag_Logic {

	
public static void main(String[] args) {
		
		String pass = "Omkar!1316XY";
		System.out.println(pass_Validator(pass));

	}
	
	public static boolean pass_Validator(String pass)
	{	if(pass.length()==12)
		{	boolean uc=false,lc=false,nc=false,sc=false;
			for(int i=0; i<pass.length();i++)
			{
				char ch = pass.charAt(i);
				if(ch>='A' && ch<='Z')
				{
					uc=true;
				}
				else if(ch>='a' && ch<='z' )
				{
					lc=true;
				}
				else if(ch>='0' && ch<='9')
				{
					nc=true;
				}
				else
					sc=true;
			}
			
			if(uc && lc && nc && sc)
			{
				return true;
			}
			
		}
	return false;
	}
}
