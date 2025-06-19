class Adhar_Details{
	String name;
	String address;
	long adharNo;
	String dob;
	
	public Adhar_Details(){};
	public Adhar_Details(	String name,String address,long adharNo,String dob)
	{	super();
		this.name=name;
		this.address=address;
		this.adharNo=adharNo;
		this.dob=dob;
		System.out.println("Adhar details added Succesfully!");
	};
	
	public String toString()
	{
		return "Adhar Details: " + " [Name : "+name+ " , Address : " + address +" AdharNo : " +adharNo+ ", DOB : " +dob+ "]";
	}
	
	public boolean equals(Object o)
	{
		Adhar_Details a = (Adhar_Details)o;
		
		if(this.name==a.name && this.address==a.address && this.adharNo==a.adharNo && this.dob==a.dob)
		{
			System.out.println("Duplicate Adhar Registration found : Name:"+this.name+" Address: "+ this.address + " AdharNo: "+ this.adharNo +" DOB : "+this.dob);
			return true;
		}
		else if(this.name==a.name)
		{
			System.out.println("Duplicate Name found: " +this.name);
			return true;
		}
		
		else if(this.adharNo==a.adharNo)
		{
			System.out.println("Duplicate adharNo found: " +this.adharNo);
			return true;
		}
		return false;
	}
}
public class OBJECT_CLASS_equals_Method_Driver {
	public static void main(String [] args)  throws InterruptedException
	{
		Adhar_Details a1 = new Adhar_Details("Omkar","Nashik",111111111111l,"07/05/2003");
		System.out.println(a1);
		Thread.sleep(700);
		
		Adhar_Details a4 = new Adhar_Details("Omkar","Nashik",111111111111l,"07/05/2003");
		System.out.println(a4);
		Thread.sleep(700);
		
		Adhar_Details a2 = new Adhar_Details("Raj","Pune",222222222222l,"09/08/2001");
		System.out.println(a2);
		Thread.sleep(700);
		
		Adhar_Details a3 = new Adhar_Details("Omkar","Nashik",222222222222l,"11/05/2002");
		System.out.println(a3);
		Thread.sleep(700);
		
		Adhar_Details a5 = new Adhar_Details("Aditya","Pune",222222224563l,"11/05/2000");
		System.out.println(a5);
		Thread.sleep(700);
		
		Adhar_Details a6 = new Adhar_Details("Aditya","Pune",222222264666l,"11/05/2000");
		System.out.println(a6);
		Thread.sleep(700);
		
		a1.equals(a4);
		Thread.sleep(700);
		a2.equals(a3);
		System.out.println();
		a5.equals(a6);
		System.out.println();
	}
}
		
		
	
	
	