import java.util.Scanner;
public class Odd_No_Forlopp_100_1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the end range from where you want to print the even numbers:");
		int end = sc.nextInt();
		System.out.print("enter the start range from where you want to print the even numbers:");
			int start = sc.nextInt();
			
			for(int i = end;i>=start;i--){
				if(i%2!=0){
					System.out.println(i+ "  ");
				}
				else{
					System.out.println();
				}
			}
	}
}