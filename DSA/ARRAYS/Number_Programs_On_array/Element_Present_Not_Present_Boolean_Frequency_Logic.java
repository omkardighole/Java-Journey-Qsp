package arrays;

import java.util.Arrays;

public class Element_Present_Not_Present_Boolean_Frequency_Logic {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 2, 4, 6, 8 };
		boolean tf[] = new boolean[arr1.length];

		int cntt = 0; // ✅ Move outside the loop

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					if (!tf[j]) { // avoid counting same element twice
						tf[j] = true;
						cntt++;
					}
				}
			}
		}
		if (cntt > 0)
			matched(tf, arr1, cntt);
	}

	public static void matched(boolean tf[], int arr1[], int cntt) {
		int ans[] = new int[arr1.length - cntt];
		int idx = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (!tf[i]) {
				ans[idx++] = arr1[i]; // ✅ use separate index
			}
		}
		System.out.println("Matched elements: " + Arrays.toString(ans));
	}
}
