import java.util.Scanner;
public class MinDigitNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a NUmber:");
		int num = sc.nextInt();
		int dup = num;
		int min = 9;
		for(int i=num ; i>0 ; i/=10){
			int dgt =i%10;
			if(min>dgt){
				min=dgt;
			}
			
		}
		System.out.println(dup+ " The Smallest digit in given number is : " +min);
	}
}