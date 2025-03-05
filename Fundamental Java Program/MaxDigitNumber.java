import java.util.Scanner;
public class MaxDigitNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a NUmber:");
		int num = sc.nextInt();
		int dup = num;
		int max = 0;
		for(int i=num ; i>0 ; i/=10){
			int dgt =i%10;
			if(max<dgt){
				max=dgt;
			}
			
		}
		System.out.println(dup+ " The largest digit in given number is : " +max);
	}
}