package strings;

public class Password_Validation {

	public static void main(String[] args) {
		
		String pass = "Omkar!1316XY";
		System.out.println(pass_Validator(pass));

	}
	
	public static boolean pass_Validator(String pass)
	{	if(pass.length()==12)
		{	int arr[]=new int [4];
			for(int i=0; i<pass.length();i++)
			{
				char ch = pass.charAt(i);
				if(ch>='A' && ch<='Z')
				{
					arr[0]=1;
				}
				else if(ch>='a' && ch<='z' )
				{
					arr[1]=1;
				}
				else if(ch>='0' && ch<='9')
				{
					arr[2]=1;
				}
				else
					arr[3]=1;
			}
			for(int i=0 ;i<arr.length;i++)
			{
				if(arr[i]==0)
				{
					return false;
				}
			}
			return true;
			
		}
	return false;
	}
}
				
		