import java.util.Scanner;
class StrPrac2{
	public static void main ( String [] args){
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enetr the String ");
		String str = sc.next();
		String rev="";
		char ch = 0 ;
		for(int i = str.length() ; i >=0 ;i--)
		{
			ch= str.charAt(i);
			System.out.print("  " +ch);
		}
		
		//System.out.println("  " +ch);
	}
}
			