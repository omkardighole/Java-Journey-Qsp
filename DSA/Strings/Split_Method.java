package strings;

public class Split_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static void split(String str,char splitter)
	{String [] arr =  new String [str.length()];
	String a="";
	
		for(int i =0 ; i<str.length();i++ )
		{
			if(str.charAt(i)==splitter)
			{
				a=str.charAt(str.length()-i);
			}
		}
	}

}
