package Principle_Of_Oop;

public class ATM_Card_Has_A_Relationship {
	
	String ownerName;
	long cardNo;
	String validYear;
	long limit;
	
	
	
	ATM_Card_Has_A_Relationship(){}
	
	ATM_Card_Has_A_Relationship(String ownerName ,long cardNo ,String validYear,long limit )
	{
		this.ownerName = ownerName;
		this.cardNo = cardNo;
		this.validYear=validYear;
		this.limit= limit;
		
		System.out.println("ATM Card is Created");
	}
	
	public void displayATM_Card()
	{
		System.out.println("Owner Name : " +ownerName);
		System.out.println("Card No : " +cardNo);
		System.out.println("Valid Year : " +validYear);
		System.out.println("Card Limit : " +limit);
	}
	
	

}
