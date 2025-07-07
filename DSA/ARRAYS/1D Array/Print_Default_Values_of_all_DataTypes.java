package arrays;

public class Print_Default_Values_of_all_DataTypes {

public static void main(String[] args) {
		
		byte [] arr0 = new byte[2];
		System.out.println(arr0[0]); // 0
		System.out.println(arr0[1]); // 0
	
		short [] arr2 = new short[3];
		System.out.println(arr2[0]); // 0
		System.out.println(arr2[1]); // 0
		System.out.println(arr2[2]); // 0
		
		int [] arr1 = new int[5];
		System.out.println(arr1[0]); // 0
		System.out.println(arr1[1]); // 0
		System.out.println(arr1[2]); // 0
		System.out.println(arr1[3]); // 0
		System.out.println(arr1[4]); // 0
		
		// System.out.println(arr1[5]);   // ArrayIndexOutOfBoundsException
		// System.out.println(arr1[-1]);  // ArrayIndexOutOfBoundsException
		
		long [] arr3 = new long[5];
		System.out.println(arr3[0]); // 0
		System.out.println(arr3[1]); // 0
		System.out.println(arr3[2]); // 0
		System.out.println(arr3[3]); // 0
		System.out.println(arr3[4]); // 0
		
		float [] arr4 = new float[3];
		System.out.println(arr4[0]); // 0.0
		System.out.println(arr4[1]); // 0.0
		System.out.println(arr4[2]); // 0.0
		
		double [] arr5 = new double[3];
		System.out.println(arr5[0]); // 0.0
		System.out.println(arr5[1]); // 0.0
		System.out.println(arr5[2]); // 0.0
		
		boolean [] arr6 = new boolean[2];
		System.out.println(arr6[0]); // false
		System.out.println(arr6[1]); // false
		
		char [] arr7 = new char[3];
		System.out.println(arr7[0]); // (empty output: default '\u0000')
		System.out.println(arr7[1]); // (empty output)
		System.out.println(arr7[2]); // (empty output)
		
		String [] arr8 = new String[4];
		System.out.println(arr8[0]); // null
		System.out.println(arr8[1]); // null
		System.out.println(arr8[2]); // null
		System.out.println(arr8[3]); // null
	}
}
