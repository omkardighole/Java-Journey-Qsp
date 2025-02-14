import java.util.Scanner;

public class MinutesToYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Minutes to Convert to Years and Days: ");
        
        long minutes = sc.nextLong();
        long days = minutes / 1440; // 1 day = 1440 minutes
        long years = days / 365; // Extract full years
        long remainingDays = days % 365; // Get remaining days

        System.out.println(years + " Year(s) and " + remainingDays + " Day(s)");
        
       
    }
}
