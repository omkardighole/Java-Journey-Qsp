import java.util.Scanner;
public class HollowTriangle3{
	public static void main(String [] args){
		int n = 4;
		
		for(int i = 4; i>=0 ; i-- )
		{
			for(int j = 0; j<=i ; j++)
			{	if(j==0 ||j==n-i || i==0 )
				System.out.print("*");
			}
		System.out.println();	
		}
		
	}
}
