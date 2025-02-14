import java.util.Scanner;
public class PrimeNumberInGiven_Range{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Start Range :");
		int start = sc.nextInt();
		System.out.print("Enter a End Range :");
		int end = sc.nextInt();
		
    for(int j=start	 ; j<=end ; j++)
	{
		
			boolean flag = true ;
				if(j==1)
					j++;
			for(int i =2 ; i<j; i++)  
				{	
					if(j%i==0)
						{	flag = false;
								break;
						}
				}
				
			if(flag)
				System.out.print(j+"   ");
			//else 
			//	System.out.println(num+" is NOT  a Prime Number");
	}
			}
}
				