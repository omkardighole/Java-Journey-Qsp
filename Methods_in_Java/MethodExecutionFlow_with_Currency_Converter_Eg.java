import java.util.Scanner;
public class MethodExecutionFlow_with_Currency_Converter_Eg{
	public static void main(String [] args){
		
		System.out.println("Main Start");
		Scanner xc = new Scanner(System.in);
		System.out.println( "enter the Rupee value");
		
		double rupee = xc.nextDouble();
		
		rupeeToDollar(rupee);          //method call
		
		System.out.println("Main end");
	}
	public static void rupeeToDollar(double rup)
	{
		System.out.println("rupeeToDollar start");
		double dollar = rup/87.15;
		System.out.println(dollar);
		dollarToEuro(dollar);
		System.out.println("rupeeToDollar end");
	}
	
	public static void dollarToEuro(double dollar)
	{
		System.out.println("dollarToEuro start");
		double euro = dollar * 0.95;
		System.out.println(euro);
		
		euroToDirhams(euro);   //method call
		
		System.out.println("dollarToEuro end");
	}
	
	
	public static void euroToDirhams(double euro)
	{
		System.out.println("euroToDirhams start ");
		double dirhams = euro * 3.85;
		System.out.println(dirhams);
		
		System.out.println("euroToDirhams end");
	}
}