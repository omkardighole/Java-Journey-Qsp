import java.util.Scanner;
public class BinaryNumber_To_DecimalNumber {
	public static void main(String [] args)
	{ Scanner sc = new Scanner (System.in);
	System.out.print("Enter a Number:");
	int num = sc.nextInt();
	String bin = Integer.toBinaryString(num);
	System.out.println(bin);
	
	int num2 = Integer.parseInt(bin,2);
	System.out.println("Decimal Coversion again :" + num2);
	}
}