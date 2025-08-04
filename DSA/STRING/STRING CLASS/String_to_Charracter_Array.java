package strings;

import java.util.Arrays;

public class String_to_Charracter_Array {

	public static void main(String[] args) {

		String str = " I lOve My self ";
		System.out.println(Arrays.toString(convertToCharArray(str)));

	}
	public static char[] convertToCharArray(String str)
	{
		char [] arr = new char[str.length()];
		for(int i=0 ; i<str.length();i++)
		{
			arr[i]=str.charAt(i);
		}
		return arr;
	}

}
