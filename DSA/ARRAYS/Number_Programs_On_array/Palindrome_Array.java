package arrays;

public class Palindrome_Array {
	
	public static void main(String[] args) {
		int arr [] = { 1,2,3,3,2,1};
		System.out.println(isPalindrome(arr));
	}
	public static boolean isPalindrome(int [] arr)
	{
		for(int i=0,j=arr.length-1;i<arr.length;i++,j--)
		{
			if(arr[i]==arr[j])
			{
				continue;
			}
			else
			{
				return false;
			}
		}
		return true;
	}

}
