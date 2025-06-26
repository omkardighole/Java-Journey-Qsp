public class StringIndexExample {
    public static void main(String[] args) {
        String text = "Java";

        try {
            System.out.println("Char at index 10: " + text.charAt(10)); // 💥 Out of range
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Index is outside the string length.");
        }
    }
}
