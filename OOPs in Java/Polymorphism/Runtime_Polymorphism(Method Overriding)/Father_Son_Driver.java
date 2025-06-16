class Father{
	public void name()
	{
		System.out.println("Criminal");
	}
	public void finance()
	{
		System.out.println("Rich");
	}
}
class Son extends Father{
	public void name()
	{
		System.out.println("Good Boy");
	}
}
public class Father_Son_Driver{
	Father f = new Son();//Upcasting to prove runtime polymorphism
	f.name();
	f.finance();
}
