import java.util.Scanner;
public class FascinatingNumber_Number_logic{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A tHreee Digit Number:");
		int num = sc.nextInt();
		int temp = num;
		int dup = num;
		boolean flag = true;
		
		for(int i = 2; i<=3 ; i++)   //loop for creating a 9 digit number by multiplying by 2 and 3 and merging with original number
		{
			num=(num*1000)+(temp*i);
		}
		
		for(int i =1; i<=9 ; i++)  //1
		{int cnt = 0;
			for(int j=num; j>0 ; j/=10)
			{
				if((j%10)==i)  
				{
					cnt++;
				}
			}
			
		if(cnt!=1 || cnt>1)
		{
			flag = false;
			break;
		}
			
		}
		if(flag)
		{
			System.out.println(dup + " is a Fascinating Number");
		}
		else
		{
			System.out.println(dup + " IS not a Fascinating Number");
		}
	}
}