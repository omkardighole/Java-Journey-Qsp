package Two_D_Arrays;

import java.util.Arrays;

public class Transpose_2D_ARray {

	public static void main(String[] args) {
		
		
		int arr[][]= {
						{1,2,3},
						{4,5,6},
						{7,8,9},
						
					};
		
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				int temp=0;
				if(j>i)
				{
					temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				}
			}
			System.out.println();
		}
		for(int i=0 ; i<arr.length;i++)
		System.out.println(Arrays.toString(arr[i]));
	}

}
