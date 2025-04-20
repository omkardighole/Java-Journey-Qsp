package Principle_Of_Oop;

 class Electronics {
	String brand;
	double power;
	String type;
	String name;
	String origin;
	
	public Electronics()
	{ super();
	}
	
	public Electronics(String brand , double power , String type , String name , String origin)
	{
		super();
		this.brand = brand;
		this.power=power;
		this.type= type;
		this.name=name;
		this.origin= origin;
		
	}
	public void displayElectronics()
	{
		System.out.println("Electronics Details");
		System.out.println("Brand : "+brand);
		System.out.println("Power : "+power);
		System.out.println("Type : "+type);
		System.out.println("NAme :" +name);
		System.out.println("Orign : "+origin);
		System.out.println();
	}
}

class Mobile extends Electronics
{
	String name;
	String brand;
	double price;
	String company;
	String assCountry;
	
	public Mobile()
	{
		super();
	}
	
	public Mobile(String brand1 , double power , String type , String name1 , String origin,String name,
			String brand,double price,String  company , String assCountry)
	{
		super(brand1,power,type,name1,origin);
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.company=company;
		this.assCountry=assCountry;
	}
	public void displayMobile()
	{
		System.out.println("Device Details");
		System.out.println("Name : "+name);
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Company : "+company);
		System.out.println("ASSEMBLED in : "+assCountry);
		System.out.println();
	}
	
}
public  class SingleLevel_Inheritance_electronics_Mobile
{
	public static void main(String args [])
	{
		Mobile m1 = new Mobile("Mediatek",5.0,"Processor","MediaTek Dimensity 9000",
				"China","Mobile Device","OPPO",20000.0,"Chintech Solution","India");
		
		m1.displayElectronics();
		m1.displayMobile();
	}
}
