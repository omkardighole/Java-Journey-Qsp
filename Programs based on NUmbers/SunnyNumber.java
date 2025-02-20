import java.util.Scanner;
 public class SunnyNumber{
	public static void main(String [] args){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a Number:");
	int num  = sc.nextInt();
	int newNum =num +1;
	
	for(int i = 1; i<=newNum/2;i++)
	{
		if(i*i==newNum)
		{
			System.out.println(num+ " is a Sunny NUmber");
			break;
		}
	}
	}
 }