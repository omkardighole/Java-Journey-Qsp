package strings;

import java.util.Arrays;

public class Covert_String_To_Byte_Array {

	public static void main(String[] args) {
		
		String str = " My NAme is Omkar";
		
		System.out.println(Arrays.toString(convertToByteArray(str)));

	}
	
	public static byte[] convertToByteArray(String str)
	{
		byte [] arr = new byte[str.length()];
		for(int i=0 ; i<str.length();i++)
		{
			arr[i]=(byte)str.charAt(i);
		}
		return arr;
	}
	
	
}
