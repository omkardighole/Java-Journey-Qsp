import java.util.Scanner;

public class GoodPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Start Range: ");
        int start = sc.nextInt();
        System.out.print("Enter an End Range: ");
        int end = sc.nextInt();
        int rem, cnt = 0;

        for (int j = start; j <= end; j++) {
            boolean flag = true;
            if (j == 1) continue; // Skip 1 as it's not prime

            // Check if j is prime
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) { // If number is prime, check its digits
                int temp = j;
                while (temp > 0) {
                    rem = temp % 10;

                    boolean digitFlag = true;
                    if (rem == 1) {
                        digitFlag = false;
                        break;
                    }
                    for (int i = 2; i < rem; i++) {
                        if (rem % i == 0) {
                            digitFlag = false;
                            break;
                        }
                    }
                    if (!digitFlag) {
                        flag = false;
                        break;
                    }
                    temp /= 10;
                }
            }

            if (flag) {
                System.out.print(j + "  ");
                cnt++; // Count good prime numbers
            }
        }
        System.out.println("\nTotal Good Prime Numbers: " + cnt);
    }
}
