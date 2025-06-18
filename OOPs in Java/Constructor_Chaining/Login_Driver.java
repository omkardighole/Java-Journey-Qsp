class Login{
	String userName;
	String mobile;
	String pass;
	int otp;
	
	public Login(){};
	public Login(String userName,String pass)
	{
		this.userName=userName;

		this.pass=pass;
		
	}
	public Login(String userName,String pass,String mobile,int otp)
	{ this(userName,pass);
		this.mobile=mobile;
		this.otp=otp;
	}
	public void displayLogin()
	{System.out.println("Login Credentials");
		System.out.println(userName);
		System.out.println(pass);
		System.out.println(mobile);
		System.out.println(otp);
	}
}
public class Login_Driver{
	public static void main(String [] args)
	{
		Login l = new Login("omkar","Om@123");
		l.displayLogin();
	}
}
		
		
	