public class Pattern9{
	public static void main(String [] args){
		int n = 6;
		int row , col;
		char ch='a';
		int num = 1;
		for(row = 1 ;  row <= n ; row ++)
		{
			for(col = 1; col <=row ; col++)
			{
				if(row%2!=0)
				{
					System.out.print(ch+" ");
					ch++;
					
				}
				else{
					System.out.print(num+" ");
					num++;
				}
			}
			System.out.println();
		}
	}
}
