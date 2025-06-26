public class MultipleCatchExample {
    public static void main(String[] args) {
        String str = null;
        int[] arr = {1, 2, 3};

        try {
            int result = 10 / 0;                  // ArithmeticException
            System.out.println(str.length());     // NullPointerException
            System.out.println(arr[5]);           // ArrayIndexOutOfBoundsException
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught: ArithmeticException - Cannot divide by zero.");
        } 
        catch (NullPointerException e) {
            System.out.println("Caught: NullPointerException - String is null.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: ArrayIndexOutOfBoundsException - Invalid array index.");
        }

        System.out.println("Program continues...");
    }
}
