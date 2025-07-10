package arrays;
import java.util.Arrays;

public class Half_Reverse_Array {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 5, 6};
		System.out.println(Arrays.toString(halfReverse(arr)));
	}

	public static int[] halfReverse(int[] arr) {
		int ans[] = new int[arr.length];

		// Keep first half as it is
		for (int i = 0; i < arr.length / 2; i++) {
			ans[i] = arr[i];
		}

		// Reverse second half
		for (int i = arr.length - 1, j = arr.length / 2; j < arr.length; i--, j++) {
			ans[j] = arr[i];
		}

		return ans;
	}
}
