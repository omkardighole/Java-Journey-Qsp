import java.util.Scanner;
public class CurrencyConverter{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("**********Currency Converter**************");
System.out.println();
System.out.println();
		System.out.print("Enter a Currency amount in INR :");
		float inr = sc.nextFloat();
		System.out.println();
		System.out.println("***************** List of Currency *********************");
		System.out.println("1.USD");
		System.out.println("2.PKR");
		System.out.println("3.EUR");
		System.out.println("4.GBP");
		System.out.println("5.YEN");
		System.out.print("Enter the Currency to convert: ");

		String curr = sc.next().toUpperCase();
		float convCurr = 0;
		if(curr.equals("USD")){
			convCurr=inr/86.56f;
			System.out.println(inr+"  INR  = " +convCurr );
		}
		else if(curr.equals("PKR")){
			convCurr=inr * 3.23f;
			System.out.println(inr+"  INR  = " +convCurr );
		}
		else if(curr.equals("EUR")){
			convCurr=inr /90.27f;
			System.out.println(inr+"  INR  = " +convCurr );
		}
		else if(curr.equals("GBP")){
			convCurr=inr / 0.0093f;
			System.out.println(inr+"  INR  = " +convCurr );
		}
		else if(curr.equals("YEN")){
			convCurr=inr * 1.80f;
			System.out.println(inr+"  INR  = " +convCurr );
		};
	}
}
			




		
		
		
