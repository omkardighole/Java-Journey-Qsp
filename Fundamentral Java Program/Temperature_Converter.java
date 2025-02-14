import java.util.Scanner;
public class Temperature_Converter{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\n******************** WELCOME *********************");
		System.out.print("\n\n************** 	Temperature Converter  *********");
		
		for( ;  ; ){
		
		System.out.print("\n\n\nEnter Temperature in Celsius:");
		float cel = sc.nextFloat();
		System.out.println("\n *** List of Temperaturature Conversions ***");
		System.out.println("1.Fahrenheit");
		System.out.println("2.Kelvin");
		System.out.println("3.Reaumur");
		System.out.println("4.Romer");
		System.out.print("Choose one option:");
		int op=sc.nextInt();
		
		
		float fah,kel,rea,ro;
		System.out.println();
		
		switch(op){
			case 1:{
				fah=(cel*(9.0f/5.0f)+32);
				System.out.println(" The Temperature in Fahrenheit is : " +fah+ " F");
				break;
			}
			case 2:{
				kel=(cel+273.15f);
				System.out.println(" The Temperature in Kelvin is : " +kel+ " K");
				break;
			}
			case 3:{
				rea=(cel*(5.0f/4.0f));
				System.out.println(" The Temperature in Reaumur is : " +rea+ " Re");
				break;
			}
			case 4:{
				ro=((cel*(40.0f/21.0f))-7.5f);
				System.out.println(" The Temperature in Romer is : " +ro+ " Ro");
				break;
			}
			default :System.out.println("Invalid Input");
		}
		
		
		
	}
}
}