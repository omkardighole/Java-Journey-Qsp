import java.util.Scanner;
public class Icrement_Decrement_OPerator_Example2{
	public static void main(String [] args){
		int p= -1 , q= 5 , r= 17 , s;
		
		s = p++ - q-- * r;
		s = s++;
		q = -p++ + r--;
		
		System.out.println("P:" +p); 
		System.out.println("Q:" +q); 
		System.out.println("R:" +r); 
		System.out.println("S:" +s); 
	}
}
		