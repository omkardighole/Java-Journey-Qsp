import java.util.Scanner;
public class Currency_Converter
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Currency Converter");
		System.out.println("1.USD");
		System.out.println("2.EURO");
		System.out.println("3.AZN");
		System.out.println("4.BDT");
		System.out.println("5.BGN");
		System.out.println();
		System.out.print("Enter the Currency to convert from abovee options :");
		String str = sc.next().toUpperCase();
		System.out.print("Enter the Currency in INR");
		float inr = sc.nextFloat();
		float converted = 0;
		boolean flag = true;
		
		switch(str)
		{
			case "USD" :
					{    converted = inr /85.5165f;
						break;
					}
		    case "EURO" : 
			{
				converted = inr/0.010f;
				break;
			}
			case "AZN":
			{
				converted= inr/0.020f;
				break;
			}
			case "BDT":
			{
				converted = inr *1.43f;
				break;
			}
			case "BGN":
			{
				converted = inr/0.020f;
				break;
			}
			default:
			{
				flag = false;
				
			}
		}
		if(flag)
		{
			System.out.println("The Coverted Currency is " +converted);
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}
			