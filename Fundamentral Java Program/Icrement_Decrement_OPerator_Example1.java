import java.util.Scanner;
public class Icrement_Decrement_OPerator_Example1{
	public static void main(String [] args){
		int a=5 , b=7 , c= 3 , d;
		
		a = b++ - --c;
		d = ++c + b--;
		c = a++ + --b + ++d;
		
		System.out.println("A:" +a); 
		System.out.println("B:" +b); 
		System.out.println("C:" +c); 
		System.out.println("D:" +d); 
	}
}
		