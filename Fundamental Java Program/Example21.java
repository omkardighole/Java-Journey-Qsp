import java.util.Scanner;
public class Example21{
public static void main(String [] args){
	int i;
	for(i=1 ; i<=1; i++){
		int num =(int)(Math.random()*10);
		if(num>=1 && num<=3){
			System.out.println(num+" ");
			continue;
		}
		i--;
		
	}
}
}
