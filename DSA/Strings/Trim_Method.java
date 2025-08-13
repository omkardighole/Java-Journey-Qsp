package strings;

public class Trim_Method {

	public static void main(String[] args) {

		String str="   Omkar     Dighole   ";
		System.out.print(trim(str));
		trim(str);
		

	}
	
	public static String trim(String s)
	{
		int start;
		int end;
		for(start=0;start<s.length();start++)
			if(s.charAt(start)!=' ')
				break;
		for(end =s.length()-1;end>0;end--)
			if(s.charAt(end)!=' ')
				break;
		char[]ar = new char[(end-start)+1];
		for(int i=start,j=0;i<=end;i++)
				ar[j++] = s.charAt(i);
		return new String(ar);
	}
}