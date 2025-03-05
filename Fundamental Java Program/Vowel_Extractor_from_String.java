import java.util.Scanner;
public class Vowel_Extractor_from_String{
public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter Your Name:");
	String name = sc.nextLine().toUpperCase();
	
	for(char i=0;i<=name.length()-1;i++){
		char ch = name.charAt(i);
	     if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')){
			 System.out.println(name.charAt(i));
		
		}
	}
}
}