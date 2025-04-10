package Principle_Of_Oop;

public class ATM_machine_ATM_Card_Has_A_Relationship_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM_machine_ATM_Card_Has_A_Relationship a1 = new ATM_machine_ATM_Card_Has_A_Relationship("SBI","Deccan" , 20000l ,2000000l);
		
		a1.displayAtm_MAchine();
		a1.atmGenrator("Omkar", 21326554l, "05/2030", 20000);
		
		a1.atm1.displayATM_Card();
	}

}
