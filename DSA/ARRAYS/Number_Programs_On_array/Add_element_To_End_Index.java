package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Add_element_To_End_Index {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		System.out.print("Enter a number to add in the array: ");
		int ele = sc.nextInt();

		System.out.println("Enter index where to add the element (0 to " + arr.length + "): ");
		int index = sc.nextInt();

		// Array size is +1 to accommodate the new element
		int[] ans = new int[arr.length + 1];

		if (index >= 0 && index <= ans.length - 1) {
			for (int i = 0; i < ans.length; i++) {
				if (i < index) {
					ans[i] = arr[i];
				} else if (i == index) {
					ans[i] = ele;
//				} else {
//					ans[i] = arr[i - 1];
				}
			}
			System.out.println("Resultant Array: " + Arrays.toString(ans));
		} else {
			System.out.println("Index out of bounds.");
		}
	}
}
