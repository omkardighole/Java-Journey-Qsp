package Two_D_Arrays;

public class Sum_Of_Borders 
{
	
	public static void main(String[] args)
	{
		
		int [][] arr = {
				{1 ,2 ,3 ,4 },
				{5, 6 ,7 ,8 },
				{9,10,11,12 },
				{13,14,15,16},
	
		  };
				int leftSideSum=0,	rightSideSum=0,	topSideSum=0,	downSideSum=0;

						for(int i=0; i<arr.length;i++)
						{
							for(int j=0 ; j<arr[i].length ; j++)
								{
									if(j==0)
									{
										leftSideSum+=arr[i][j];
									}
								}
						}
						System.out.println("Left Side Sum : "+leftSideSum);
						
						for(int i=0; i<arr.length;i++)
						{
							for(int j=0 ; j<arr[i].length ; j++)
								{
									if(i==0)
									{
										topSideSum+=arr[i][j];
									}
								}
						}
						System.out.println("TOP Side Sum : "+topSideSum);
						
						
						for(int i=0; i<arr.length;i++)
						{
							for(int j=0 ; j<arr[i].length ; j++)
								{
									if(i==arr[i].length-1)
									{
										downSideSum+=arr[i][j];
									}
								}
						}
						System.out.println("Down Side Sum : "+downSideSum);
						
						
						for(int i=0; i<arr.length;i++)
						{
							for(int j=0 ; j<arr[i].length ; j++)
								{
									if(j==arr[i].length-1)
									{
										rightSideSum+=arr[i][j];
									}
								}
						}
						System.out.println("right Side Sum : "+rightSideSum);
	}

}
