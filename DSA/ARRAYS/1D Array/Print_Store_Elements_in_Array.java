package arrays;

public class Print_Store_Elements_in_Array {
	public static void main(String [] args) {
		
	byte [] arr1 = new byte[2];
	arr1[0] = 127;
	arr1[1] = 20;
	for(int i = 0; i < arr1.length; i++) {
		System.out.print(arr1[i] + " ");
	}
	// Output: 127 20
	
	System.out.println();
	
	short [] arr2 = new short[3];
	arr2[0] = 32000;
	arr2[1] = 87;
	arr2[2] = 7657;
	for(int i = 0; i <= arr2.length - 1; i++) {
		System.out.print(arr2[i] + " ");
	}
	// Output: 32000 87 7657
	
	System.out.println();
	
	int [] arr3 = new int[2];
	arr3[0] = 2147364148;
	arr3[1] = 89765;
	for(int i = 0; i < arr3.length; i++) {
		System.out.println(arr3[i]);
	}
	// Output:
	// 2147364148
	// 89765
	
	long arr4 [] = new long[2];
	arr4[0] = 1212122L;
	arr4[1] = 8966664646L;
	for(int i = 0; i <= arr4.length - 1; i++) {
		System.out.println(arr4[i] + " ");
	}
	// Output:
	// 1212122 
	// 8966664646 
	
	float arr5 [] = new float[2];
	arr5[0] = 87.89f;
	arr5[1] = 85.45f;
	for(int i = 0; i < arr5.length; i++) {
		System.out.println(arr5[i]);
	}
	// Output:
	// 87.89
	// 85.45
	
	double arr6 [] = new double[1];
	arr6[0] = 8745464.7d;
	System.out.println(arr6[0]);
	// Output: 8745464.7
	
	char arr7 [] = new char[2];
	arr7[0] = 'A';
	arr7[1] = 'B';
	for(int i = 0; i < arr7.length; i++) {
		System.out.println(arr7[i]);
	}
	// Output:
	// A
	// B
	
	String arr8 [] = new String [2];
	arr8[0] = "Omkar";
	arr8[1] = "Dighole";
	for(int i = 0; i < arr8.length; i++) {
		System.out.println(arr8[i]);
	}
	// Output:
	// Omkar
	// Dighole
  }
}
