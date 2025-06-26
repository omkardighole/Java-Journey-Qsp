public class ArrayIndexExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        try {
            System.out.println("Value: " + arr[5]); // Index out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is outside the array limit.");
        }
    }
}
