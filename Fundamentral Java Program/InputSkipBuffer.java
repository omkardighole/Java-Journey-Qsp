  import java.util.Scanner;
public class InputSkipBuffer{
  public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter  your name:");
	String name = sc.nextLine();
	System.out.println("Enter your Age:");
	int age = sc.nextInt();

//input is Skipped here due to buffer is already carrying value of Carriage Return

	sc.nextLine();
// a empty nextLine() method is used to consume the Carriage return in java

	System.out.println("Enter your Address:");
	String address = sc.nextLine();

	System.out.println("Name:"+name);
	
        System.out.println("Age:"+age);
	System.out.println("Address:"+address);
 }


/*
When Input is Skipped in Java
Input skipping usually happens when using Scanner with mixed input types (e.g., nextInt(), nextDouble(), and nextLine()).

Common Cause: nextLine() After nextInt() or nextDouble()
nextInt() and nextDouble() read only the number, leaving the newline character (\n) in the buffer.
When nextLine() is called next, it reads and consumes the leftover \n, appearing as if input is skipped.*/

}


