import java.util.Scanner;
public class KrishnaMurtiNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Nuumber:");
		int num = sc.nextInt();
		int dup=num;
		int sum=0;
		
		for(int i =num; i>0;i/=10)
		{ 
				int rem=i%10;
				int fact=1;
				for(int j =1;j<=rem;j++)
					fact=fact*j;
				sum=sum+fact;
		}
System.out.println((sum==dup)?(dup+" is a KrishnaMurthy Number"):(dup+" Not a KrishnaMurthy Number"));
	}
}	