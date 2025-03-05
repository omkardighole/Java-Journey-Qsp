import java.util.Scanner;
public class SimpleCalculator{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println(); 
		System.out.print("***************  Welcome to Simple Calculator  ******************");
		System.out.println();
		System.out.println();
		System.out.print("Enter num1:");
		int num1 = sc.nextInt();
		System.out.println();
		System.out.print("Enter num2:");
		int num2 = sc.nextInt();
		System.out.println();
		System.out.print(" List of operations :");
		System.out.println();
		System.out.println();
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println();
		
		int result = 0;
		
		System.out.print("Enter Operation no from above list to perform:");
		byte opt = sc.nextByte();
		
		switch(opt){
			
			case 1:{
				
				result = num1 + num2;
				System.out.print("The Addition is : " + result);
				break;
			}
			case 2:{
				result = num1 - num2;
				System.out.print("The Subtraction  is : " + result);
			break;}
			case 3:{
				result = num1 * num2;
				System.out.print("The Multiplication  is : " + result);
				break;
			}
			case 4:{
				result = num1 / num2;
				System.out.print("The Division is : " + result);
				break;
			}
			
			default:{
				System.out.print("Invalid Input");

	   }
	}
 }
}