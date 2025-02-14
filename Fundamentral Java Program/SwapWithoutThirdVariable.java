import java.util.Scanner;
public class SwapWithoutThirdVariable{
	public static void main(String [] args){
		
		int a = 10;
		int  b = 20;
		
		a = b + a;
		b = a - b;
		a = a - b;
		
		
		System.out.println("A = " +a+ " B = " +b);
		
	}
}