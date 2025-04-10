package Principle_Of_Oop;

public class Sim_Has_A_RelationShip {
	
	String serviceProvider;
	String networkType;
	String type;
	long simNo;
	
	public Sim_Has_A_RelationShip()
	{
		
	}
	
	Sim_Has_A_RelationShip(String sp ,String networkType , String type , long simNo )
	{
		serviceProvider=sp;
		this.networkType=networkType;
		this.type=type;
		this.simNo=simNo;
	}
	
	public void displaySim()
	{
		System.out.println("Service Provider : "+serviceProvider);
		System.out.println("Service Network : "+networkType);
		System.out.println("Sim  : "+type);
		System.out.println("SIM NO : "+simNo);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
