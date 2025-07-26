package arrays;

import java.util.Arrays;

public class Quick_Sort_Recursive_Approach {

	public static void main(String[] args) {
		int[] arr = {2, 5, 6, 78, 5, 3, 3, 6, 8, 9, 7};

		quickSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int pos = partition(arr, start, end);

			quickSort(arr, start, pos - 1);
			quickSort(arr, pos + 1, end); // ✅ Fixed
		}
	}

	public static int partition(int[] arr, int start, int end) {
		int ref = arr[start]; // pivot
		int i = start;
		int j = end;

		while (i < j) {
			while (i <= end && arr[i] <= ref) {
				i++;
			}

			while (j > start && arr[j] > ref) { // ✅ Fixed: arr[j] instead of arr[i]
				j--;
			}

			if (i < j) {
				swap(arr, i, j);
			}
		}

		swap(arr, start, j);

		return j;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
