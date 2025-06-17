// Abstract class with abstract method
abstract class Prime {
    public abstract boolean isPrime(int n);
}

// Concrete implementation class
class Prime_Imp extends Prime {
    public boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

// Driver class
public class Prime_Driver {
    public static void main(String[] args) {
        Prime p1 = new Prime_Imp();
        
        int number = 3;
        if (p1.isPrime(number))
            System.out.println(number + " is a Prime number.");
        else
            System.out.println(number + " is NOT a Prime number.");
    }
}
