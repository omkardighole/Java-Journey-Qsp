import java.util.Scanner;
public class Prime_Factors_Of_Number{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nUMber");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i<=num; i++){
			int deno = 2;
			if(num % i==0){
				count++;
				
		   while(deno<i){
			     if(i%deno==0){
				  break;
			} 
			deno++;
		}
		if(i==deno){
			System.out.println(i+ "  ");
		}
			}
		}
		System.out.println("The Above are all  prime factors of given number " );}	
		
}