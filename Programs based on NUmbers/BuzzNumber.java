import java.util.Scanner;
 public class BuzzNumber{
	public static void main(String [] args){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a Number:");
	int num  = sc.nextInt();
	
	
	if(num%7==0 || num==(num%10))
	{
		System.out.println(num + " is a Buzz Number");
	}
	else
	{
		System.out.println(num+ " is not a Buzz Number");
	}
	}
 }