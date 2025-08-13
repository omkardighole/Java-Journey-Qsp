package strings;

public class Return_Numbers_From_String {

	public static void main(String[] args) {
		String str = "1omkar45loves143JAva";
		int num = numberSeperator(str);
		System.out.println(num);

	}
	public static int numberSeperator(String str)
	
	{	String num="";
		for(int i =0 ; i<str.length();i++)
		{	char ch = str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				num+=ch;
			}
		}
		return Integer.parseInt(num);
	}
	
	public static int sum_dgt_String(int n)
	{
		int sum=0;
		for(int i = n ; i>0 ; i/=10)
		{
			sum+=(i%10);
		}
		return sum;
	}

}
