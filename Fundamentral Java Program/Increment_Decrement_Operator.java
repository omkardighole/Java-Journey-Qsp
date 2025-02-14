import java.util.Scanner;
public class Increment_Decrement_Operator{
	public static void main(String [] args){
	int a = 100;
	System.out.print("Increment Operator Testing");
	System.out.println(++a); //101
	System.out.println(++a);//102
	System.out.println(a++);//102
	System.out.println(++a);//104
	System.out.println(++a);//105
	System.out.println(a++);//105
	System.out.println(++a);//107
	
	System.out.println("Decrement Operator Testing");
	
	System.out.println(--a); //106
	System.out.println(--a);//105
	System.out.println(a--);//105
	System.out.println(--a);//103
	System.out.println(--a);//102
	System.out.println(a--);//102
	System.out.println(--a);//100
}
}
	