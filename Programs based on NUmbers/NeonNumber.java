import java.util.Scanner;
 public class NeonNumber{
	public static void main(String [] args){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a Number:");
	int n  = sc.nextInt();
    int sqr = n*n;
	int sum =0;
	while(sqr>0){
		sum+=(sqr%10);
		sqr/=10;
	}
	/*for(int  i =sqr; i>0 ; i/=10)
	{
		sum+=(i%10);
	}*/
	if(n==sum)
	{
		System.out.println(n+ " is a Neon Number");
	}
	else{
		System.out.println(n+ " is not  a Neon Number");
	}
	}
 }
		
	
	