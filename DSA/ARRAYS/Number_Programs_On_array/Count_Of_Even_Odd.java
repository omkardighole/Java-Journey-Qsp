package arrays;

public class Count_Of_Even_Odd {

	public static void main(String[] args) {
		int [] arr = { 1,454,87,54,876,23,46,6546,32135,1654,6464,897,45,218,8,4,52,4,8,54,8787,5};
		int [] res = count(arr);
		System.out.println("even Count : "+res[0]);
		System.out.println("Odd Count : "+res[1]);

	}
	
	public static int [] count(int [] arr)
	{
		int evenCnt=0,oddCnt=0;
		
		for(int i = 0 ; i<arr.length ; i++)
		{
			if(arr[i]%2==0)
				evenCnt++;
			else
				oddCnt++;
		}
		return new int[] {evenCnt,oddCnt};
	}

}
