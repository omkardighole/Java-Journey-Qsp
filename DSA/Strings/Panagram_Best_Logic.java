package strings;

public class Panagram_Best_Logic {

	public static void main(String[] args) {
		String str = "the quick bown fox jumps over the lazy dog";
		if(isPanagram(str))
		{
			System.out.println("PANAGRAM");
		}
		else
		{
			System.out.println("Not a Panagram");
		}

	}
	
	public static boolean isPanagram(String  s)
	{
		int [] ct = new int[26];
		for(int i=0 ; i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ct[ch-97]++;
				
			}
			else if(ch>='A' && ch<='Z')
			{
				ct[ch-65]++;
				
			}
		}
		for(int i =0 ; i<26 ; i++)
		{
			if(ct[i]==0)
				return false;
		}
		return true;
	}

}
