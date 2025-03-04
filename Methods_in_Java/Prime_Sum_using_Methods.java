import java.util.Scanner;
public class Prime_Sum_using_Methods{
	public static void main(String [] args)
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Number:");
	int num = sc.nextInt();
		System.out.println(digit(num));


	}
	


  public static int isPrime(int n)
  {
	  for(int den = 2 ; den < n ; den ++)
	  {
		  if(n % den == 0)
		  {
			  break;
		  }
		}
		return n;
  }
  
  public static boolean digit(int d)
  {   int sum = 0;
		for(int i = d ; i!= 0 ; i/=10)
			{
				int dgt = d %10;
			
				sum= sum + isPrime(dgt);
			}
			System.out.println(sum);
				return sum==d;
		
  }
  
 
  
}