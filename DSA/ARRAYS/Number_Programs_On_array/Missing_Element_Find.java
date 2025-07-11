package arrays;

import java.util.Arrays;

public class Missing_Element_Find {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 6, 7};

		int minmax[] = minMax(arr);
		int min = minmax[1];
		int max = minmax[0];
		System.out.println(min + " " + max);

		find(arr, min, max);
	}

	public static void find(int arr[], int min, int max) {
		for (int i = min; i <= max; i++) {
			boolean found = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("The missing element is: " + i);
			}
		}
	}

	public static int[] minMax(int arr[]) {
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return new int[]{max, min};
	}
}
