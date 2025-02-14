import java.util.Scanner;
public class If_Example2{
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Bill:");
	float billAmt = sc.nextFloat();
	
	if(billAmt>2000){
		billAmt-=(billAmt*0.1);
	};
	
	System.out.println("The bill Amount is :" +billAmt);
}
}
	
