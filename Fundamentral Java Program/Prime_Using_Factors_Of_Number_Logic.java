import java.util.Scanner;
public class Prime_Using_Factors_Of_Number_Logic{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nUmber:");
		int num = sc.nextInt();
		int cnt = 0;
		
		for(int i=2; i<num; i++){
			if(num%i==0){
				cnt++;
				System.out.print(cnt==0?num+" is prime ":num+" is not prime");
			}
		}
	}
	}