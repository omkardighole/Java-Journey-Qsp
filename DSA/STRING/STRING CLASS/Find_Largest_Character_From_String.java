package strings;

public class Find_Largest_Character_From_String {

	public static void main(String[] args) {
		
		String str = " ZDAzDA ";
		char max = Character.MIN_VALUE;
		for(int i = 0 ; i< str.length() ; i++)
		{ 
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z'  || ch>='a' && ch<='z' || ch==' ')
			{ 
				if(ch>=max)
				{
					max=ch;
				}
			}
		}
		System.out.println("THE LARGEST CHARACTER IN THE GIVEN STRING IS : " + max);

	}

}
