import java.util.Scanner;
public class ForLoop_Example1{
	public static void main(String [] args){
		System.out.println("here 1 to 10 is printed");
	for(int i=1;i<=10;i++){
		System.out.print(+i+ "  ");//1 to 10
	}
	System.out.println();
	System.out.println("A to Z is printed here ");

	for(char ch='A';ch<='Z';ch++){
				System.out.print((ch+0)+" ");//when used+ gives ascii value when not used + i.e(ch)only gives abcd
	}
	System.out.println();
	/*
	System.out.println();
	for(char ch='0';ch<='9';ch++){
		System.out.println(ch);  //0 to 9 digits
	}
	System.out.println();
	
	System.out.println();
	
	for(char ch='z';ch>='a';ch--){
		System.out.print(ch);
	}
	System.out.println();
	System.out.println();*/
	System.out.println("ASCII Values are printed here :");
	char ch = 0;
	for(int x=0;x<=127;x++){
		System.out.println(x+  " = "+ ch++);
	
	} 
	}
	
}