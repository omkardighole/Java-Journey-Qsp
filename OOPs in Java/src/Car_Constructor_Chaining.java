class Car_Constructor_Chaining
{
	String brand;
	String name;
	String model;
	long price;
	boolean sunroof;
	boolean meterDisplay;
	boolean autonomous;
	
	Car_Constructor_Chaining(){};
	
	Car_Constructor_Chaining(String brand,String name , String model,long price)
	{
		this.brand=brand;
		this.name=name;
		this.model=model;
		this.price = price;
	}
	
	Car_Constructor_Chaining(String brand,String name , String model,long price,boolean sunroof)
	{
		this(brand,name,model,price);
		this.sunroof=sunroof;
	}
	
	Car_Constructor_Chaining(String brand,String name , String model,long price,boolean sunroof,boolean meterDisplay)
	{
		this(brand,name,model,price,sunroof);
		this.meterDisplay=meterDisplay;
	}
	
	Car_Constructor_Chaining(String brand,String name , String model,long price,boolean sunroof,boolean meterDisplay,boolean autonomous)
	{
		this(brand,name,model,price,sunroof,meterDisplay);
		this.autonomous=autonomous;
	}
	
	public void displayCar()
	{
		System.out.println("Brand: " +brand);
		System.out.println("Name: " +name);
		System.out.println("Model: " +model);
		System.out.println("Price: " +price);
		System.out.println("Sunroof: " +sunroof);
		System.out.println("Meter Display: " +meterDisplay);
		System.out.println("Autonomous: " +autonomous);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		
	}
}
		
	
	
	
	
	