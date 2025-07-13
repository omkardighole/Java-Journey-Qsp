package arrays;

import java.util.Arrays;

public class Merge_An_Array_Fromg_Given_index_in_new_ARray {

	public static void main(String[] args) {
		
		int arr1 [] = {100,200,300,400,500};
		int arr2[] = {10,20,30,40};
		System.out.println("Enter the index: ");
		int index = 3;
		
		int res[] = new int [arr1.length+arr2.length];
		
		for (int i = 0; i < res.length; i++) {
		    if (i < index) {
		        res[i] = arr1[i];
		    } else if (i >= index && i < index + arr2.length) {
		        res[i] = arr2[i - index];
		    } else {
		        res[i] = arr1[i - arr2.length];
		    }
		}
		System.out.println(Arrays.toString(res));
		
		

	}

}
