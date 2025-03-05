import java.util.Scanner;
public class PrimitiveTypeCastingNarrowingForLong{
	public static void main(String [] args){
	
		long l = 987654321;
		int i = (int)l;
		short s = (short)l;
		byte b =(byte) l;
		char c = (char) l;

		System.out.println("Long output: " +l);
		System.out.println("Int output:" +i);
		System.out.println("Short Output:" +s);
	System.out.println("Byte Output: " +b);
	System.out.println("Char Output: " +c);
	}
}

	
		