public class NullPointer_Exception {
    public static void main(String[] args) {
        
        Scanner sc = null; //  Intentionally assigning null

        try {
            System.out.print("Enter the first Number : ");
            int num = sc.nextInt(); //  This will throw NullPointerException
            
            System.out.print("Enter the second Number : ");
            int den = sc.nextInt();

            int result = num / den;
            System.out.println("Answer is " + result);
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException: Scanner is not initialized.");
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }

        System.out.println("Thank you");
    }
}
