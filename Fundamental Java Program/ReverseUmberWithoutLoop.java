import java.util.Scanner;

public class ReverseNumberWithoutLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int duplicate = num;
		rev = 0;
		int rem;

		rem = num % 10;
		rev = (rev * 10) + rem;

		num = num / 10;
		rem = num % 10;
		rev = (rev * 10) + rem;

		num = num / 10;
		rem = num % 10;
		rev = (rev * 10) + rem;

		if (duplicate == rev) {
			System.out.println("The reverse of " + duplicate + " is " + rev);
		}
		;
	}
}
