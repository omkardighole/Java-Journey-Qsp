package Principle_Of_Oop;

public class Mobile_Sim_Has_A_RelationShip {

	String brand ; 
	String name;
	double price ;
	String type;
	Sim_Has_A_RelationShip s;
	
	Mobile_Sim_Has_A_RelationShip(){}
	
	Mobile_Sim_Has_A_RelationShip(String brand , String name , double price ,  String type )
	{
		this.brand = brand ; 
		this.name = name;
		this.price = price ;
		this.type = type;
		
		System.out.println("Mobile is Created ");
	
	}
	
	public void insertSim(String sp , String networkType , String simType , long simNo)  // HELPER METHOD
	{
		s = new Sim_Has_A_RelationShip(sp , networkType , simType , simNo);
		
		System.out.println("Sim Inserted");
	}
	
	public void displayMobile()
	{
		System.out.println(brand);
		System.out.println(name);
		System.out.println(price);
		System.out.println(type);
	}
}
