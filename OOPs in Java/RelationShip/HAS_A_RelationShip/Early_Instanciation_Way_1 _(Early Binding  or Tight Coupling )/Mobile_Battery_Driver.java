class Battery{
	String brandb;
	int mah;
	
	public Battery(){};
	public Battery(String brandb , int mah)
	{
		this.brandb =brandb;
		this.mah= mah;
	}
	
	public void displayBattery()
	{
		System.out.println(brandb);
		System.out.println(mah);
	}
}
class Mobile{
	String brand;
	String name;
	String model;
	int ram;
	Battery b1;
	public Mobile(){};
	public Mobile(String brand,String name , String model,int ram,String brandb,int mah)
	{	b1 = new Battery(brandb,mah);
		this.brand=brand;
		this.name=name;
		this.model=model;
		this.ram=ram;
	}
	public void displayMobile()
	{
		System.out.println(brand);
		System.out.println(name);
		System.out.println(model);
		System.out.println(ram);
	}
}
public class Mobile_Battery_Driver{
	public static void main(String [] args)
	{
		Mobile m1 = new Mobile("Realme","9 Pro Plus","Top model",6,"Lithium ion Battery ",5000);
		
		m1.displayMobile();
		m1.b1.displayBattery();
	}
}
	