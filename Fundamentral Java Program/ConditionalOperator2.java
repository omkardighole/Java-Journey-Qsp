import java.util.Scanner;
public class ConditionalOperator2{
	public static void main(String [] args){
		
		int a = 22;
		int b = 4;
		int c = 1;
		int largest = (a>b) ?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println(largest);
	}
}