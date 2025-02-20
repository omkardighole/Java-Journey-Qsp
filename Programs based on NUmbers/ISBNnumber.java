import java.util.Scanner;
public class ISBNnumber{
	public static void main(String [] args){
		long num = 1259060977l;
		long  sum = 0;
		for(long i =num , j=1;i>0 ; i/=10,j++)
		{
			long rem = i%10;
			sum+=(rem*j);
		}
		if(sum%11==0)
			System.out.println(num+" is valid ISBN Number");
		else
			System.out.println(num+" is Not a valid ISBN Number");
	}
}