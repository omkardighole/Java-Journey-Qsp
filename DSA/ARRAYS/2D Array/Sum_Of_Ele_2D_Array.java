package Two_D_Arrays;

public class Sum_Of_Ele_2D_Array {

	public static void main(String[] args) {
		
		int arr[][]= {
				
						{1,2,3},
						{4,5,6},
						{7,8,9},
					};
		
		int sum =0 ;
		
		for(int i=0;i < arr.length;i++)
		{
			for(int j=0 ; j<arr[i].length ; j++)
			{
				sum+=arr[i][j];
			}
		}
		
		System.out.println("The Sum of All the elements of an array is : " + sum);

	}

}
