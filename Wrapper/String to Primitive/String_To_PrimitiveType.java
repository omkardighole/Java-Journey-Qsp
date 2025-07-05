package Wrapper;

public class String_To_PrimitiveType {

	public static void main(String[] args) {
		
		// 🔹 String → char
		String str11 = "A";
		char ch = str11.charAt(0); // Extract first character of string
		System.out.println("char: " + ch); // Output: A
		
		// 🔹 String → boolean
		String str10 = "true";
		boolean b1 = Boolean.parseBoolean(str10); // Converts "true"/"false" to boolean
		System.out.println("boolean: " + b1); // Output: true
		
		// 🔹 String → byte
		String str = "5";
		byte b = Byte.parseByte(str); // Parses string to byte
		System.out.println("byte + 10: " + (b + 10)); // Output: 15
		
		// 🔹 String → short
		String str1 = "542";
		short s = Short.parseShort(str1); // Parses string to short
		System.out.println("short + 5: " + (s + 5)); // Output: 547
		
		// 🔹 String → int
		String str2 = "6545";
		int i = Integer.parseInt(str2); // Parses string to int
		System.out.println("int + 12: " + (i + 12)); // Output: 6557
		
		// 🔹 String → long
		String str3 = "45125445";
		long l = Long.parseLong(str3); // Parses string to long
		System.out.println("long + 5: " + (l + 5)); // Output: 45125450
		
		// 🔹 String → float
		String str4 = "45.45";
		float f = Float.parseFloat(str4); // Parses string to float
		System.out.println("float + 45: " + (f + 45)); // Output: 90.45
		
		// 🔹 String → double
		String str5 = "465656.545454";
		double d = Double.parseDouble(str5); // Parses string to double
		System.out.println("double: " + d); // Output: 465656.545454
	}
}
