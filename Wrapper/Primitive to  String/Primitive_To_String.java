package Wrapper;

public class Primitive_To_String {

	public static void main(String[] args) {
		
		// 🔹 int → String
		int a = 100;
		String strInt = String.valueOf(a); // converts int to String
		System.out.println("int to String: " + strInt + 45); // Output: "10045"
		
		// 🔹 float → String
		float f = 15.12f;
		String strFloat = String.valueOf(f); // converts float to String
		System.out.println("float to String: " + strFloat + 129); // Output: "15.12129"
		
		// 🔹 double → String
		double d = 456.789;
		String strDouble = String.valueOf(d); // converts double to String
		System.out.println("double to String: " + strDouble + 11); // Output: "456.78911"

		// 🔹 long → String
		long l = 123456789L;
		String strLong = String.valueOf(l); // converts long to String
		System.out.println("long to String: " + strLong + 100); // Output: "123456789100"

		// 🔹 short → String
		short s = 32000;
		String strShort = String.valueOf(s); // converts short to String
		System.out.println("short to String: " + strShort + 5); // Output: "320005"

		// 🔹 byte → String
		byte b = 12;
		String strByte = String.valueOf(b); // converts byte to String
		System.out.println("byte to String: " + strByte + 123); // Output: "12123"

		// 🔹 char → String
		char ch = 'A';
		String strChar = String.valueOf(ch); // converts char to String
		System.out.println("char to String: " + strChar + "BC"); // Output: "ABC"

		// 🔹 boolean → String
		boolean bool = true;
		String strBool = String.valueOf(bool); // converts boolean to String
		System.out.println("boolean to String: " + strBool + false); // Output: "truefalse"
	}
}
