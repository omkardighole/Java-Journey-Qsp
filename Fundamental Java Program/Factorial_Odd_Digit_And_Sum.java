import java.util.Scanner;
public class Factorial_Odd_Digit_And_Sum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int  sum = 0;
		int rem;
        while(num > 0){
            int fact = 1;
            rem = num % 10;
            if(rem % 2 != 0){
                for(int i = 1; i <= rem; i++){
                    fact *= i;
					
                                             }
			sum += fact;
                            }
            num /= 10;
        }
        System.out.println("The Sum of all odd numbers factorials is " + sum);
    }
}