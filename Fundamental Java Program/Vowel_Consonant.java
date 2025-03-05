import java.util.Scanner;
public class Vowel_Consonant{
	public static void main(String [] args){
		System.out.print("Enter a character to check it is vowel or not :");
		Scanner sc= new Scanner(System.in);
		char ch = sc.next().charAt(0);
		String ans = (ch =='a' || ch =='e' ||ch =='i' || ch =='o' || ch =='u' )? ( ch +"is a vowel"): (ch +" is consonant");
		System.out.println(ans);
	}
}
//check wheteher the character is vowel or not 