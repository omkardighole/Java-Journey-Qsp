import java.util.Scanner;
public class PrimitiveTypeCastingNarrowingForInt{
	public static void main(String [] args){
	
		int i = 21474836;
		short s = (short)i;
		byte b =(byte) i;
		char c = (char) i;

		System.out.println("Int output:" +i);
		System.out.println("Short Output:" +s);
	System.out.println("Byte Output: " +b);
	System.out.println("Char Output: " +c);
	}
}

	
		