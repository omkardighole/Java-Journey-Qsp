import java.util.Scanner;
public class Factors_Of_Number{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nUmber:");
		int num = sc.nextInt();
		int cnt = 0;
		int i;
		for( i=1; i<=num; i++){
			if(num%i==0){
				cnt++;
				System.out.print(i+ "  ");
			}
			
		}
		System.out.print("Total factors are " +cnt);
	}
	}