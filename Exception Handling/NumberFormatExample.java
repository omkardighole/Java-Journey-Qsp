public class NumberFormatExample {
    public static void main(String[] args) {
        String data = "abc123"; // not a valid number

        try {
            int num = Integer.parseInt(data); // 💥 NumberFormatException
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Cannot convert string to number.");
        }
    }
}
