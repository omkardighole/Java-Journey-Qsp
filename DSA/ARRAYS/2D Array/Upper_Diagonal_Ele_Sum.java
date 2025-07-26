package Two_D_Arrays;

public class Upper_Diagonal_Ele_Sum {

	public static void main(String[] args) {
		
		int  arr[] []= {
				
						{1,2,3,9},
						{4,5,6,9},
						{7,8,9,9},
						{1,4,7,8},
						
						};
		
		int sum =0;

		for(int i =0 ; i<arr.length ; i++)
		{
			for(int j =0 ; j<arr[i].length ; j++)
			{
				if(j>i)
				{
					sum+=arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}

}
