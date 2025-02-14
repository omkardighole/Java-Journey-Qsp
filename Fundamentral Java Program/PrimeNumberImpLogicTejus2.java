import java.util.Scanner;
public class PrimeNumberImpLogicTejus2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nUmber:");
		int numo= sc.nextInt();
		int deno = 2;
		while(deno<=numo/2){
			if(numo%deno==0){
				break;
			}
			deno++;
		}
		if(deno>numo/2){
			System.out.println("It is Prime");
		}
		else{
			System.out.println("Not Prime");
		}
	}
}