public class SwapKthElemntArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;  // Swap the 2nd element from the start with the 2nd from the end

        // Perform the swap
        int temp = arr[k - 1];
        arr[k - 1] = arr[arr.length - k];
        arr[arr.length - k] = temp;

        // Print the modified array
        for (int i=0 ; i<arr.length;i++) {
            System.out.print(arr[i]+ "  ");
        }
    }
}
