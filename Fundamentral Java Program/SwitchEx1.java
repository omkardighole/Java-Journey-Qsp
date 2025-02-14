import java.util.Scanner;
public class SwitchEx1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the option from 1 to 5 to execute caases:");
		byte ip =sc.nextByte();
		
		switch(ip)
		{
			case 1:{
				System.out.println("From case 1");
				break;
			}
			case 2: {
				System.out.println("From case 2");
				break;
			}
			case 3:{
				System.out.println("From case 3");
				break;
			}
			case 4: {
				System.out.println("From case 4");
				break;
				
			}
			case 5:{
				System.out.println("From case 5");
				break;
			}
			
			default:
			{System.out.println("From Default");
			break;
			}
		}
	}
}