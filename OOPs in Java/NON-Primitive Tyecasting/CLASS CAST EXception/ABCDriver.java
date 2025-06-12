class A{
	public void xyz()
	{System.out.println("from A");
	}
}
class B extends A
{
	public void abc()
	{
		System.out.println("From B");
	}
}
class C extends A
{
	public void abc()
	{
		System.out.println("From C");
	}
}
public class ABCDriver{
	public static void main(String [] args)
	{
		A a1 = new B();//UPcasting:B 's object is stored in reference of Class A
		B b1 = new B();
		C c1 = (C)a1;//Class Cast Exception
		c1.abc();//Exception in thread "main" java.lang.ClassCastException: B cannot be cast to C
        //at ABCDriver
	}
}