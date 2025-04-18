import java.util.Scanner;
public class Fact{
	public static void main(String [] args){
		
		int sum = 0;
		for(int i = 1; i<=5;i++){
			sum+=fact(i);   //fact(1)   fact(2)  fact(3)
		
		}
		System.out.print(sum);

	}
	
	public static int fact(int n){  //(1)  (2)
		int fact = 1;
		for(int i = 1;i<=n;i++){//n=1;   n=2  
			fact*=i;  //fact = fact *i;
					//fact   = 1  *  1 = 1   
					//fact = 1 *2 =   2
		}
		return fact;
	}
}
		