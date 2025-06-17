public class add{
	static String a = "omiiii";
	
	public static void main(String [] args)
	{	System.out.println("MAin starts");
		a = "omkar";
		System.out.println(add(5,6));
		System.out.println("MAin ends");
	}
	public static int add(int n1 , int n2)
	{
		int c = n1+ n2;
	return c;
	}
	static
	{
	System.out.println("Ststic block 1");
	}
	static {
		System.out.println("static block 2 = " +add(4,5));
	}
	static
	{
	System.out.println("Ststic block 3");
	}
	
	
		
}