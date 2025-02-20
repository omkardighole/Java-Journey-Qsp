import java.util.Scanner;
 public class SpyNumber{
	public static void main(String [] args){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a Number:");
	int num  = sc.nextInt();
	int sum = 0;
	int product = 1;
	int rem;
	
	for(int i = num ; i>0 ; i/=10)
	{
		rem=i%10;
		sum+=rem;
		product*=rem;
	}
	System.out.println("The numbers Sum is " +sum);
	System.out.println(" The numbers Product  is " +product );
	
	if(sum==product)
		System.out.println(num + " is spy Number");
	else
		System.out.println(num + " is not a SPY Number");
	}
 }