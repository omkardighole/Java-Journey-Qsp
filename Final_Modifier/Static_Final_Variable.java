package Final_Modifier;
import java.util.Scanner;

public class Static_Final_Variable {
	
	
	
	//final static int A;//CTE
	
	final static double PI = 22.0/7.0;
	
	final static int TEN_CUBE;
	static {
			int pow = 0;
			for(int i = 0; i<3;i++)
			{
				pow+=pow;
			}
			TEN_CUBE=pow;
	}
	
	// final static int a;
	
//	final static int c;
//	public static int GetC(int a)
//	{
//		return c;
//	}
	


	static final  Static_Final_Variable obj = new  Static_Final_Variable();
	
	public static void main(String[] args) {
		
		
	// Static_Final_Variable.a=1000;
		
		
		System.out.println(TEN_CUBE);
		
		
//		Static_Final_Variable.GetC(5);
	}

}

