package Two_D_Arrays;

public class Product_Ele_2D_Array {

	public static void main(String[] args) {
		
		int arr [][]= {
							{1,2,3,4},
							{5,6,7,8},
							{9,1,2,3},
							{4,5,6,7},
					  };
		
		int product = 1;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j = 0; j<arr[i].length ; j++)
			{
				product*=arr[i][j];
			}
		}
		
		System.out.println("The Product of the array elemts is : "+product);

	}

}
