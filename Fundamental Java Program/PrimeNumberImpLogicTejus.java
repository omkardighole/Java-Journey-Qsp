import java.util.Scanner;
public class PrimeNumberImpLogicTejus{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nUmber:");
		int numo= sc.nextInt();
		int deno = 2;
		while(deno<numo){
			if(numo%deno==0){
				break;
			}
			deno++;
		}
		if(numo==deno){
			System.out.println("It is Prime");
		}
		else{
			System.out.println("Not Prime");
		}
	}
}