package arrays;

public class Palindrome_Array_Using_While_LOOP {

	public static void main(String[] args) {
		int arr [] = { 1,2,3,3,2,1};
		System.out.println(isPalindrome(arr));

	}
	public static boolean isPalindrome(int [] arr)
	{
	
		int i =0; int j = arr.length-1;
		
		while(i<j)
		{
			if(arr[i]==arr[j])
			{
				i++;
				j--;
			}
			else {
				break;
			}
		}
		return i>=j;
	}

}
