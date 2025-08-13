package strings;

public class Panagram {

	public static void main(String[] args) {
		String str="the  quick brown fox jumps over the lazy dog";
		
		
		System.out.println(isPanagram(str.toUpperCase()));

	}
	public static boolean isPanagram(String str)
	{
		char ar[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int cnt=0;
		for(char i = 0;i<ar.length;i++)
		{
			for(char j = 0 ; j<str.length();j++)
			{
				if(ar[i]==str.charAt(j))
					cnt++;
			}
			if(cnt>=1)
				cnt=0;
			else {
				return false;
			}
		}
		return true;
	}
}
