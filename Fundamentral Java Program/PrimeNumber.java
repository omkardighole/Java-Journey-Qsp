import java.util.Scanner;
public class PrimeNumber{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  :");
		int num = sc.nextInt();
		
		boolean flag = true ;
		if(num==1)
			flag = false; 
		for(int i =2; i<num; i++)  
		{	
			if(num%i==0)
			{	flag = false;
				break;
			}
		}
			if(flag)
				System.out.println(num+" is a Prime Number");
			else 
				System.out.println(num+" is NOT  a Prime Number");
	
			}
}
				