package arrays;

import java.util.Arrays;

public class Vowel_Consonant_Separate {

	public static void main(String[] args) {
		char[] arr = {'a','b','c','d','e','f','g','h','i','k','l','m','n','q'};
		vowel_Consonant_Separate(arr);
	}

	public static void vowel_Consonant_Separate(char[] arr) {
		int i = 0, j = arr.length - 1;

		while (i < j) {
			while (i < j && isVowel(arr[i])) {
				i++;
			}
			while (i < j && !isVowel(arr[j])) {
				j--;
			}
			if (i < j) {
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	public static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
}
