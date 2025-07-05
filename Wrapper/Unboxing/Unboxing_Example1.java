package Wrapper;

public class Unboxing_Example1 {

	public static void main(String[] args) {
		
		// ✅ Integer to int
		Integer i1 = new Integer(10);
		int intVal = i1.intValue();       // Manual unboxing from Integer to int
		System.out.println(intVal + 10);  // Output: 20

		// ✅ Float to float
		Float f1 = new Float(20.5f);
		float floatVal = f1.floatValue();       // Manual unboxing from Float to float
		System.out.println(floatVal + 10);      // Output: 30.5

		// ✅ Long to long
		Long l1 = new Long(100L);
		long longVal = l1.longValue();          // Manual unboxing from Long to long
		System.out.println(longVal + 10);       // Output: 110

		// ✅ Short to short
		Short s1 = new Short((short) 5);
		short shortVal = s1.shortValue();       // Manual unboxing from Short to short
		System.out.println(shortVal + 10);      // Output: 15

		// ✅ Byte to byte
		Byte b1 = new Byte((byte) 2);
		byte byteVal = b1.byteValue();          // Manual unboxing from Byte to byte
		System.out.println(byteVal + 10);       // Output: 12

		// ✅ Double to double
		Double d1 = new Double(45.75);
		double doubleVal = d1.doubleValue();    // Manual unboxing from Double to double
		System.out.println(doubleVal + 10);     // Output: 55.75
	}
}
