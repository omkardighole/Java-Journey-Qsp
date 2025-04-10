package Principle_Of_Oop;

public class Mobile_Charger_Has_A_Relationship_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile_Has_A_Relationship m1 = new Mobile_Has_A_Relationship("Realme" , "9 Pro Plus " , 25999.0 , "5000 MAh" , " Real " , "SuperDart" , "65 Watt "  , "C" );
		
		m1.displayMobile();
		m1.chargerRef.displayCharger();
	}

}
