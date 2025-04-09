package Principle_Of_Oop;

public class BankAccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount b1 = new BankAccount("Raju" ,  "SBI" ,98765432 , 1234 , "SBI1212");
		
	    System.out.println(  b1.getUserName());
	    
	    System.out.println(  b1.getBankName());
	    
	    System.out.println(  b1.getAccno());
	    
	    System.out.println(b1.getBalance(98765432,1234));
				
		b1.credit(98765432,1234,10000);
		
		b1.debit(98765432l,1234,5000.0);
				
		System.out.println(b1.getBalance(98765432,1234));
				
		b1.setPin(98765432,1234,9876);
				
	}

}
