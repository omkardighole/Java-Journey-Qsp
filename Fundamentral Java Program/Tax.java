import java.util.Scanner;
public class Tax{
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your Salary:");
	double sal = sc.nextDouble();
	double tax=0;
	
	if(sal>0 && sal<=1200000){
		System.out.println("No Tax on income upto 1200000 lakhs. ENJOY ! ");
		}
	else if(sal>1200000 && sal<=1500000){
		tax = (sal*0.15);
		System.out.println(+tax+ " is Taxable amount on your income at 15 % tax");
	}
	
	else if(sal>1500000 ){
		tax = (sal*0.30);
		System.out.println(+ tax + " is Taxable amount on your income at 30 % tax");
	}
	
	else{
	System.out.println("Invalid Input");
	}
	}
}
