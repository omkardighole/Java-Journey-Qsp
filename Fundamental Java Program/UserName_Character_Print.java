import java.util.*;
public class UserName_Character_Print{
	public static void main(String [] args)
	throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name:");
		String name=sc.nextLine().toUpperCase();
		for(char i =0;i<=name.length()-1;i++){
		System.out.println(name.charAt(i));
		Thread.sleep(2000);
		}
		
	}
}