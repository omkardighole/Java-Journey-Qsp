import java.util.Scanner;
public class ArmstrongNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Nuumber:");
		int num = sc.nextInt();
		int dup=num;
		int len=0;
		int sum=0;
		
		for(int i =num; i>0;i/=10)
			len++;
		
		while(num>0)
		{
			int rem = num%10;
			int pow=1;
			
			for(int i=1; i<=len;i++)
					pow *=rem;   //pow=pow*rem
				
			sum+=pow;
			num/=10;
		}
	System.out.println((sum==dup)?(dup+" Armstrong Number"):(dup+ " Not a Armstrong number"));
	}
}
	