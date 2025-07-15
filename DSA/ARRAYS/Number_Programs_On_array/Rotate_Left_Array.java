package arrays;

import java.util.Arrays;

public class Rotate_Left_Array {

	public static void main(String[] args) {

		int arr [] = {1,2,3,4,5,6,7,8,9};
		rotate(arr);

	}
	
	    

	    public static void rotate(int[] arr) {
	        int temp = arr[0];
	        for (int i = 0; i < arr.length - 1; i++) {
	            arr[i] = arr[i + 1];
	        }
	        arr[arr.length - 1] = temp;
	        System.out.println(Arrays.toString(arr));
	    }
	}



