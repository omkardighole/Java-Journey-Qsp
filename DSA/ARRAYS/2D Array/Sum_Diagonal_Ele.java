package Two_D_Arrays;

public class Sum_Diagonal_Ele {

	public static void main(String[] args) {
		
		int [][] arr = {
							{1 ,2 ,3 ,4 },
							{5, 6 ,7 ,8 },
							{9,10,11,12 },
							{13,14,15,16},
				
					  };
		int sum =0,sum1=0;
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0 ; j<arr[i].length ; j++)
			{
				if(i==j)
				{
					sum+=arr[i][j];
				}
			}
		}
		
		System.out.println("left to right diagonal sum : " +sum);

		for(int i=0; i<arr.length;i++)
		{
			for(int j=0 ; j<arr[i].length ; j++)
			{
				if(j==arr[i].length-i-1)
				{
					sum1+=arr[i][j];
				}
			}
		}
		System.out.println(" Sum  of right to left diagonal  " + sum1);
		
	}

}
