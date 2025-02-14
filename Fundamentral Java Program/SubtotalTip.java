  import java.util.Scanner;
public class SubtotalTip{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the bill:");
		 float bill=sc.nextFloat();
		 
		 System.out.print("enter the tip rate :");
		 
		 float tipRate=sc.nextFloat();
		 
		 float tipAmount = (tipRate*bill)/100;
		 float grandTotal=bill + tipAmount;
		 
		 System.out.println("The tip is :" +tipAmount+  "the total is " +grandTotal);
	}
}
		
