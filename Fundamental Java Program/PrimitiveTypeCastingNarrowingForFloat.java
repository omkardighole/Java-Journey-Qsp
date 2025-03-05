import java.util.Scanner;
public class PrimitiveTypeCastingNarrowingForFloat{
	public static void main(String [] args){
	
		float g = 54321.1234f;
		long l = (long)g;
		int i = (int)g;
		short s = (short)g;
		byte b =(byte) g;
		char c = (char) g;

		System.out.println("float output:" +g);
		System.out.println("Long output: " +l);
		System.out.println("Int output:" +i);
		System.out.println("Short Output:" +s);
	System.out.println("Byte Output: " +b);
	System.out.println("Char Output: " +c);
	}
}

	
		