package Principle_Of_Oop;

public class Mobile_Has_A_Relationship {
	
	String brand ;
	String model ;
	double price;
	String batteryMah;
	Charger_Has_A_Relationship chargerRef;
	
	Mobile_Has_A_Relationship()
	{};
	
	Mobile_Has_A_Relationship(String brand , String model , double price , String batteryMah , String brandd , String modell , String watt , String type  )
	{
		 chargerRef = new Charger_Has_A_Relationship(brandd , modell , watt , type);
		this.brand = brand;
		this.model=model;
		this.price = price ;
		this.batteryMah=batteryMah;
		System.out.println("Mobile is Created");
	}
	
	public void displayMobile()
	{
		System.out.println("Mobile Brand : "+brand);
		System.out.println("Mobile Model : "+model);
		System.out.println("Mobile Price : "+price);
		System.out.println("Mobile Battery Mah : "+batteryMah);
	}

}
