import java.util.Scanner;
public class EmirpNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check it is EMIRP number or not :");
		int num = sc.nextInt();
		int dup =num;
		
		int rem;
		int rev = 0;           //num = 17 for example
		boolean flag = true;    //assumes that the number is prime
		for(int i = 2; i <num; i++)   //loop for checking prime
		{
			
				if(num%i==0)	//if this condition gets execuate the the flag gets false means number is not prime 
				{
					flag = false;
					System.out.println("Not a prime Number so emirp number not exist");
					break;
				}	
				
		}
		if(flag){    //if flag remains true i.e the number is prime the this if execuate 
			while(num>0)
			{
				
					rem=num%10;
					rev=(rev*10)+rem;  //the reverse of num is calcualated
					num/=10;
			}	
				
		
		for(int i = 2; i <=rev/2; i++)	  //the reverse number is checked for prime 
		{

			if(rev%i==0)
			{
					flag =false;     // if the reverse  number is not prime then the flag gets false 
			         break;           
			}
			
		}
		if(flag)                //if the flag remains false then this prints that the number is not an emirp number
			System.out.println("it is not an emrip");
		else
			System.out.println("it is an emrip");
		}
	}
}

				