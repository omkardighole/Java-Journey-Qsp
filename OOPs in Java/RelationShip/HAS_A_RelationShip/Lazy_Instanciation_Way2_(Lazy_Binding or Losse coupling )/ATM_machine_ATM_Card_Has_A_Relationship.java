package Principle_Of_Oop;

public class ATM_machine_ATM_Card_Has_A_Relationship {
	
	String bankName;
	String branch;
	long maxMoney;
	long capacity;
	ATM_Card_Has_A_Relationship atm1;
	
	ATM_machine_ATM_Card_Has_A_Relationship(){
		
	}
	
	ATM_machine_ATM_Card_Has_A_Relationship(String bankName,String branch,long maxMoney,long capacity)
	{
		this.bankName=bankName;
		this.branch=branch;
		this.maxMoney=maxMoney;
		this.capacity = capacity;
		
		System.out.println("ATM Machine is Created");
	}
	
	public void displayAtm_MAchine()
	{
		System.out.println(bankName);
		System.out.println(branch);
		System.out.println(maxMoney);
		System.out.println(capacity);
	}
	
	//HELPER METHOD
	
	public void atmGenrator(String ownerName,long cardNo,String validYear,long limit)
	{
		atm1 = new ATM_Card_Has_A_Relationship(ownerName , cardNo , validYear , limit );
		System.out.println("Atm Card is Genrated Succesfully ");
	}

}
