package Principle_Of_Oop;

public class Mobile_Sim_Has_A_RelationShip_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile_Sim_Has_A_RelationShip m1 = new Mobile_Sim_Has_A_RelationShip("Samsung " , " S25 Ultra " , 130000.0 , "5 G");
		
		m1.displayMobile();
		
		m1.insertSim("JIO", "5 G Type","Prepaid ", 7898456521l);
		m1.s.displaySim();
		
		
	}

}
