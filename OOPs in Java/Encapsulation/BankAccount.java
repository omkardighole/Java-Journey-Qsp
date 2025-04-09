package Principle_Of_Oop;

public class BankAccount {

			private String username;
			private String bankName;
			private long accno;
			private int pin ; 
			private String ifsc;
			private double balance;
			
			
			BankAccount(String userName, String bankName , long accno , int pin , String ifsc)
			{
				username=userName; //this keyword is not used here becz object variable and method variable name are different 
				this.bankName=bankName;
				this.accno = accno;
				this.pin=pin;
				this.ifsc=ifsc;
			}
			
			public String getUserName()
			{
				return username;
			}
			
			public String getBankName()
			{
				return bankName;
			}
			
			public long getAccno()
			{
				return accno;
			}
			
			public void setPin(long accno , int oldPin ,int newPin)
			{
				if(this.accno==accno && pin == oldPin)
				{
					
					pin = newPin;
					System.out.println("Pin Updated");
					
				}
				else
				{
					System.out.println("Invalid Credentials");
				}
			}
			
			public String getIFSC()
			{
				return ifsc;
			}
			
			public double getBalance(long accno , int pin)
			{
				if(this.accno == accno && this.pin==pin)
				{
					return balance;
				}
				else
				{
					System.out.println("Invalid Credentials");
					return 0;
				}
			}
			
			public void credit(long accno , int pin , double amt)
			{
				if(this.accno==accno  &&  this.pin==pin)
				{
					if(amt>0)
					{
						balance+=amt;
						System.out.println("Amount Credited Successfully");
					}
					else
					{
						System.out.println("Inavalid Amount ");
					}
				}
				else
				{
					System.out.println("Invalid Credentials");
				}
			}
			
			public void debit(long accno , int pin , double amt)
			{
				if(this.accno ==accno && this.pin==pin)
				{
					if(amt>0)
					{
						if(balance-amt>1000)
						{
							balance-=amt;
							System.out.println("Amount debited");
						}
						else
						{
							System.out.println("Insufficient Balance");
						}
					}
					else
					{
						System.out.println("Invalid amount");
					}
				}
				else
				{
					System.out.println("Invalid Credentials");
				}
	}

}
