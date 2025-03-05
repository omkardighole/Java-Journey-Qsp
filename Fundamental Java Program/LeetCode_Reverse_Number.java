import java.util.Scanner;
public class LeetCode_Reverse_Number{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = sc.nextInt();
		
		boolean flag = false;
		if(num<0){
			flag = true; //if num is Negative
			num = Math.abs(num);
		}
		long rev=0;
		for(int i=num ; i>0 ; i/=10){
			rev = rev*10 + (i%10);
		}
		if(flag){
		rev=rev*(-1);}
		
		if(rev>Integer.MAX_VALUE){
			System.out.println(0);
		}
		else{
				System.out.println(rev);
		}
	}
}
			
		