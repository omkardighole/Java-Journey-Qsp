import java.util.Scanner;
public class Census{
	public static void main(String [] args){
		
		System.out.println("Program to find Population of next 5 years")
		
		final long currentPop = 312032486;
		final long seconds = (365*24*60*60)*5;
		
		long birth = seconds / 7;
		long death = seconds / 13;
		long immigrant = seconds / 45;
		
		long nextPop = currentPop + birth + immigrant - death ;
		
		System.out.println(" The Population of next 5 years is : " +nextPop);
	}
}