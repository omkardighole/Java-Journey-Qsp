package arrays;

public class HardCode_Elements_in_array {

	public static void main(String[] args) {
		
		int [] arr = {1, 2, 5, 8, 79, 4, 6, 6, 9, 945, 64, 656, 654, 44, 51, 1, 51, 51, 651, 561, 5, 165, 5, 64, 654, 46, 78};
		System.out.println("Length of array " + arr.length);
		// Output: Length of array 27

		for (int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// Output: 1 2 5 8 79 4 6 6 9 945 64 656 654 44 51 1 51 51 651 561 5 165 5 64 654 46 78 
		
		System.out.println();
		
		float [] arr1 = {54.5f, 87.65f, 87, 78.12f, 545.45f, 86.12f};
		System.out.println(arr1.length);
		// Output: 6

		for (int i = 0 ; i <= arr1.length - 1; i++) {
			System.out.println(arr1[i]);
		}
		// Output:
		// 54.5
		// 87.65
		// 87.0
		// 78.12
		// 545.45
		// 86.12
		
		boolean [] arr2 = { false, true, true, false };
		for (int i = 0 ; i <= arr2.length - 1; i++) {
			System.out.println(arr2[i]);
		}
		// Output:
		// false
		// true
		// true
		// false
	}
}
