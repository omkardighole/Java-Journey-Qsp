class Method_variable_Shadowing1{
	int a = 10;
	static int b = 100;
	
	public static void demo()
	{
		System.out.println("From static demo method in parent class");
	}
	public void test()
	{
		System.out.println("From non static test method from parent class");
	}
}
class Method_variable_Shadowing2 extends Method_variable_Shadowing{
	
	String a = "hi";
	String b = "bye";
	
	public static void demo()
	{
		System.out.println("From static demo method in child class");
	}
	public void test()
	{
		System.out.println("From non static test method from child class");
	}
}
public class  Method_variable_Shadowing_Driver{
	public static void main(String [] argd)
	{
		 Method_variable_Shadowing1 obj1 = new  Method_variable_Shadowing2();//upcasting
		 obj1.demo();//method shadowing 
		 obj1.test();//method overiding as it is a non static method
		 
		 //variable shadowing 
		 
		 System.out.println(obj1.a);//Static variable
		 System.out.println(obj1.b);//NON-Static variable
	}
}
		 
		
	