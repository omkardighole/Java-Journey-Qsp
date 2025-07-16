package arrays;
import java.util.Arrays;

public class Remove_DUp_Using_Frequency_Logic {

	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 5, 10, 77};
		removeDup(arr);
	}

	public static void removeDup(int arr[]) {
		int freq[] = count(arr);
		
		// Count number of -1 values to determine duplicate count
		int negative = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == -1) {
				negative++;
			}
		}

		// Create answer array with correct length (original - duplicates)
		int ans[] = new int[arr.length - negative];

		for (int i = 0, j = 0; i < arr.length; i++) {
			if (freq[i] != -1) {
				ans[j++] = arr[i];
			}
		}

		System.out.println("After removing duplicates: " + Arrays.toString(ans));
	}

	public static int[] count(int arr[]) {
		int cnt[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			if (cnt[i] != -1) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						cnt[j] = -1;
					}
				}
			}
			// Assign even if it's 0, helps in later checking
			if (cnt[i] != -1)
				cnt[i] = count;
		}
		return cnt;
	}
}
