import java.util.Scanner;
public class FrequencyOfDigitsInNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a Number:");
	long num = sc.nextLong();
	for(int i=0;i<=9;i++){ //outer loop fetchhes 0 to 9 numbers 
		int cnt = 0;
		for(long j=num;j>0;j/=10){  //for the number extraction
			long rem = j%10;
			if(i==rem){  //number extracted is compared with outer loop i th number
				cnt++;  //if number matches then the count is incremented
			}
			
		}
		if(cnt!=0)
			System.out.println(i+" : " +cnt);
	}
	}
	
}