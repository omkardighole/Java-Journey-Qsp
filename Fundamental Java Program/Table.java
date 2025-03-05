import java.util.Scanner;
public class Table{
	public static void main(String [] args){
		Scanner sc = new Scanner( System.in);
		System.out.print("Enter a number to print Table of It:");
		int num = sc.nextInt();
		System.out.print("Enter a Range of Table:");
		int range = sc.nextInt();
		
		for(int i= 0; i<=range;i++){
					System.out.println(num+ " X " +i+ " = " +(num*i));
		}
	}
}