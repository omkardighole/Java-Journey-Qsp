public class Strong_Number {
    public static void main(String[] args) {
        int num = 145;
        int temp = num;
        
        if (temp == dgt(num)) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
    }

    public static int dgt(int n) {
        int rem, sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum += fact(rem);
            n /= 10;
        }
        return sum;
    }

    public static int fact(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }
}
