import java.util.Scanner;

public class HollowTriangle3 {
	public static void main(String[] args) {
		int n = 5;

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (i == 1 || i == j || i == n || j == 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}
}
