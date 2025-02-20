import java.util.Scanner;
public class Prime_Using_Factors{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = sc.nextInt();
		int count = 0;
		for(int i = 1; i<=num; i++){
			if(num%i==0){
				count++;
			}
		}
		String ans =(count==2)?("Prime Number"):("Odd Number");
		System.out.println(ans);
	}
}
