package arrays;

public class Even_Odd_Sum {

	public static void main(String[] args) {
		
		int []arr = {1,2,3,4,5,6};
		int [] result=evenOddSum(arr);
		if(result[0]==result[1]) {
				System.out.println("Their Sum is equal");
				System.out.println("evenSum: " + result[0]);
				System.out.println("OddSum: " + result[1]);
		}
		else {
			System.out.println("Their Sum is not equal");
			System.out.println("evenSum: " + result[0]);
			System.out.println("OddSum: " + result[1]);
		}
		

	}
	
	public static int[] evenOddSum(int [] arr)
	{
		int evenSum=0,oddSum=0;
		
		for(int i =0 ; i<arr.length;i++)
		{
			int op =(arr[i]%2==0)? (evenSum+=arr[i]):(oddSum+=arr[i]);
		}
		return new int[] {evenSum,oddSum};
	}
	
}
