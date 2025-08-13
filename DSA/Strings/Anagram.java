package strings;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1, s2)); // true
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] ar1 = new int[127]; // ASCII
        int[] ar2 = new int[127];

        for (int i = 0; i < s1.length(); i++) {
            ar1[s1.charAt(i)]++;
            ar2[s2.charAt(i)]++;
        }

        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] != ar2[i]) {
                return false;
            }
        }
        return true; // only after checking all
    }
}
