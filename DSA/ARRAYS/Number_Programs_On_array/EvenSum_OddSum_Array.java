package arrays;

public class EvenSum_OddSum_Array {

	public static void main(String[] args) {
		
		int []arr = {1,2,3,4,5,6};
		System.out.println("The even Sum is :" +evenSum(arr));
		System.out.println("The odd Sum is :" +oddSum(arr));
		if(evenSum(arr)==oddSum(arr))
				System.out.println("Their Sum is equal");
		else
			System.out.println("Their Sum is not equal");
		

	}
	
	public static int evenSum(int [] arr)
	{
		int evenSum=0,oddSum=0;
		
		for(int i =0 ; i<arr.length;i++)
		{
			int op =(arr[i]%2==0)? (evenSum+=arr[i]):(oddSum+=arr[i]);
		}
		return evenSum;
	}
	public static int oddSum(int [] arr)
	{
		int evenSum=0,oddSum=0;
		
		for(int i =0 ; i<arr.length;i++)
		{
			int op =(arr[i]%2==0)? (evenSum+=arr[i]):(oddSum+=arr[i]);
		}
		return oddSum;
	}

}
