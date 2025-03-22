public class Static_Variable_Global{
	
	//banking application Balance variable 
	static double balance;
	
	public static void debit(double amt)
	{
		if(amt>0 && balance-amt>1000)
		{
			balance-=amt;
			System.out.println("Amount Debited");
			Sytem.out.println("Your Current balance is :"+balance);
		}
		else
		{
			System.out.println("Invalid Input");
		}
		public static void credit(double amt)
		{
			if(amt>0)
			{
				balance += amt;
				System.out.println("Amount credited");
				Sytem.out.println("Your Current balance is :"+balance);
			}
			else
			{
				System.out.println("Invalid Amount");
			}
		}
	}
}
