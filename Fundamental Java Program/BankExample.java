import java.util.Scasnner;

public class BankExample {
    public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String username1=null;
		String password1=null;
		String address=null;
		long contact=0;
		double balance=0.0;
		
	for( ; ; )
		{
			System.out.println();	
			System.out.println("          WELCOME                 ");
			System.out.println();
			System.out.println("1.Existing User ");
			System.out.println("2.Create Accounnt");
			System.out.println("Enter an Option:");
			int opt = sc.nextInt();
			System.out.println();
			
	if(opt==1)
	{
			
			if(username==null){
				System.out.println("Create Your Account First");
				continue;
			}
		System.out.println("LOGIN");
		System.out.println();
		
		for(int i=3; i>=1;i--)
		{	System.out.println();
		System.out.println("Username:");
		String username=sc.next();
		System.out.println("Password:");
		String password = sc.next();
		
	if(username.equals(username1) && password.equals(password1))
	{	
		home:    //label of for loop
		for( ; ; )
		{	System.out.println();
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.Mini Satement");
			System.out.println("5.Logout");
			System.out.println();
			System.out.println("Entert an Option:");
			int opt1= sc.nextInt();
			System.out.println();
			
                switch(opt1)
                {
                    case 1:
                    {
                            System.out.println("Deposit");
                            System.out.println();
                            System.out.println("Enter the Amount:");
                            double depositAmt= sc.nextDouble();
                            balance=+depositAmt;
                            System.out.println("Amount Deposited Succesfully");
                            System.out.println();
                            break;
                    }
                    case 2:
                    {
                            System.out.println("WithDraw");
                            System.out.println();
                            System.out.println("Enter the Amount");
                            double withdraw=sc.nextDouble();
                            System.out.println("Enter the PIN:");
                            String password3 = sc.next();
                            if(password3.equals(password1))
                            {
                                balance-=withdraw;
                                System.out.println("Amount Debited Succesfully");
                            }
                            else{
                                System.out.println("Wrong Pin");
                                break;
                            }
                    }
                    case 3:
                    {
                        System.out.println("Check Balanve");
                        System.out.println();
                        for(int j=3; j>=1 ; j--)
                        {	System.out.println();
                            System.out.println("Enter the pin:");
                            String password2=sc.next();
                            if(password2.equals(password1))
                            {
                                System.out.println("Account BaLANCE : " +balance + " rs ");
                                continue home;
                            }
                            else
                            {
                                System.out.println("Wrong Pin");
                                System.out.println("Attempt left :" +(j-1));
                            }
                        }
                        System.out.println("Your Account Has been Bllocked For 24 hrs");
                        System.exit(0);
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Mini Statement");
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Thank U For using our app");
                        System.out.println("Visit Again");
                        System.exit(0);
                    }
                }
           }
        }
            
        else
        {
            System.out.println("Invalid Cred");
            System.out.println("Attempt left" +(i-1));
        }
            System.out.println("Thank u and never visit again");
            System.exit(0);
	    }
		}
		
	
	
	
	else if(opt==2)
	{
		System.out.println();
		System.out.println("Account Creation");
		System.out.println("Username");
		username1=sc.next();
		System.out.println("Addresss");
		sc.nextLine(); // input skipped 
		address=sc.nextLine();
		System.out.println("Contact");
		contact=sc.nextLong();
		System.out.println("Deposit Amount");
		balance = sc.nextDouble();
		System.out.println();
		System.out.println("account Created Succesfully ");
	}
	else{
		System.out.println("Invalid option");
	}
}}
}}}