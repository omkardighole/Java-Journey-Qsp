import java.util.Scanner;
public class UserInput{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a Num1:");
	int num1=input.nextInt();
	System.out.print("enter num2:");
	int num2=input.nextInt();
	int sum=num1+num2;

	System.out.println("The sum is :"+sum);
	}
}
