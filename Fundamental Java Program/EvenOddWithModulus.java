    import java.util.Scanner;
public class EvenOddWithModulusBooleanOutput{
	public static void main(String [] args){
		System.out.print("Enter a Number: ");
		int num = new Scanner(System.in).nextInt();
		System.out.println(num%2==0);
	}
}