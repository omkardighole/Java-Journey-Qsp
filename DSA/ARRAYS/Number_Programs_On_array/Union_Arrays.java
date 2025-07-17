package arrays;
import java.util.Arrays;

public class Union_Arrays {

	public static void main(String[] args) {
		
		int arr1[] = {1, 2, 3, 58, 85, 1, 6, 3, 2};
		int arr2[] = {2, 8, 46, 3, 1, 5, 92, 47, 6};
		
		int[] union = merge(arr1, arr2);
		System.out.println("The Union of the arrays is: " + Arrays.toString(union));
	}
	
	public static int[] merge(int arr1[], int arr2[]) {
		int temp[] = new int[arr1.length + arr2.length];
		
		// Step 1: Merge both arrays
		for (int i = 0; i < temp.length; i++) {
			if (i < arr1.length)
				temp[i] = arr1[i];
			else
				temp[i] = arr2[i - arr1.length];
		}
		
		// Step 2: Sort the merged array
		int[] sortedArr = bubbleSort(temp);
		System.out.println("The sorted array is: " + Arrays.toString(sortedArr));
		
		// Step 3: Remove duplicates
		int[] union = removeDup(sortedArr);
		return union;
	}
	
	public static int[] bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] removeDup(int arr[]) {
		// Count unique elements
		int cnt = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1])
				cnt++;
		}
		
		int[] union = new int[cnt];
		union[0] = arr[0];
		int j = 1;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				union[j++] = arr[i];
			}
		}
		return union;
	}
}
