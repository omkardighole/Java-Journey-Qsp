package Principle_Of_Oop;

public class Charger_Has_A_Relationship {
	
	String brand ;
	String model ;
	String watt;
	String type;
	
	Charger_Has_A_Relationship(){};
	
	Charger_Has_A_Relationship(String brand , String model , String watt , String type)
	{
		this.brand = brand ;
		this.model = model;
		this.watt=watt;
		this.type=type;
		
		System.out.println("Charger is Created");
		
	}
	
	public void displayCharger()
	{
		System.out.println("Charger brand : " +brand);
		System.out.println("Charger model : " +model);
		System.out.println("Charger watt : " +watt);
		System.out.println("Charger type : " +type);
	}

}
