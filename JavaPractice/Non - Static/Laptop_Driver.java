class Laptop{
	String brand="ASus";
	int ram;
	int rom;
	{
		System.out.println("Non static block starts");
		System.out.println("non Static end");
	}
	static{
		System.out.println("Static start");
		
		System.out.println("Static end");
	}
	public Laptop(){
		System.out.println("Constructor start ");
		System.out.println("Constructor end ");
	}
	//public Laptop(){};
	public void display()
	{	String brand = "Lenovo";
		System.out.println(brand);
		System.out.println(ram);
		System.out.println(rom);
	}
}
public class Laptop_Driver{
	public static void main(String [] args)
	{
		Laptop l1 = new Laptop();
		l1.brand="ASUS";
		l1.ram=16;
		l1.display();
	}
}
	
	
		
		
		