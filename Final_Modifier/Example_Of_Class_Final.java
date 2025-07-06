package Final_Modifier;
final class Example_Of_Class_Final {
	int a=20;
	static int b=8;
	
	public void test()
	{
		System.out.println("non static test method of parent class");
	}
	public static void demo()
	{
		System.out.println("static demo method frrom parent class ");
	}
	
}
//public class Child  extends Example_Of_Class_Final{//cannot be subclass as parent class is final 
//	
//}
