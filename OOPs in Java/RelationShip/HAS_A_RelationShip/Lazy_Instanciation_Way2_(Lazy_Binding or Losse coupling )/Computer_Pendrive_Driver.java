class Pendrive{
	String brand;
	int size;
	
	public Pendrive(){};
	public Pendrive(String brand,int size)
	{
		this.brand=brand;
		this.size=size;
	}
		public void displayPd()
		{
			System.out.println(brand);
			System.out.println(size);
		}
}
class Computer{
	String brand;
	String model;
	int ram;
	Pendrive pd;
	
	public Computer(){};
	public Computer(String brand,String model,int ram)
	{
		this.brand=brand;
		this.model=model;
		this.ram=ram;
	}
	public void display()
	{
		System.out.println(brand);
		System.out.println(model);
		System.out.println(ram);
	}
	public void insertPD(String brand,int size)
	{
		pd=new Pendrive(brand,size);
		System.out.println("PD ATTACHED ");
	}
}
public class Computer_Pendrive_Driver
{
	public static void main(String [] args)
	{
		Computer c1 = new Computer("ASUS","F15",16);
		c1.display();
		
		c1.insertPD("Sandisk",64);
		c1.pd.displayPd();
	}
}
