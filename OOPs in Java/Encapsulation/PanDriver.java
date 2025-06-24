class PAN{
	private String name,dob,gender,address;
	private String pan="";
	private long adharNo;
	
	public PAN(String name, String dob, String gender, String address, long adharNo) {
		super();
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.adharNo = adharNo;
		//this.pan=pan;
		geneartePan(name, dob, gender, address, adharNo);
	}
	public void display()
	{
		System.out.println("Name : " +name);
		System.out.println("DOB : " +dob);
		System.out.println("Gender : " +gender);
		System.out.println("Address : " +address);
		System.out.println("Adhar Number : " +adharNo);
		System.out.println("PAN : " +pan);
		
		
	}
		
	
	public String getName()
	{
		return name;
	}
	public String getDob()
	{
		return dob;
	}
	public String getGender()
	{
		return gender;
	}
	public String getAddress()
	{
		return address;
	}
	public long getAdharNo()
	{
		return adharNo;
	}
	public String getPan()
	{
		return pan;
	}
	public void setName(int adharNo,String name)
	{
		if(this.adharNo==adharNo)
		{
			this.name=name;
			System.out.println("Name Updated Succesfully");
		}
		else
			System.out.println("invalid Credentials");
	}
	public void setDob(int adharNo,String dob)
	{
		if(this.adharNo==adharNo)
		{
			this.dob=dob;
			System.out.println("DOB  Updated Succesfully");
		}
		else
			System.out.println("invalid Credentials");
	}
	public void setGender(int adharNo,String gender)
	{
		if(this.adharNo==adharNo)
		{
			this.gender=gender;
			System.out.println("gender Updated Succesfully");
		}
		else
			System.out.println("invalid Credentials");
	}
	public void setAddress(int adharNo,String address)
	{
		if(this.adharNo==adharNo)
		{
			this.address=address;
			System.out.println("address Updated Succesfully");
		}
		else
			System.out.println("invalid Credentials");
	}
	public void setAdharNo(String pan,long newadharNo)
	{
		if(this.pan.equals(pan))
		{
			adharNo=newadharNo;
			System.out.println("Adhar Card  Updated Succesfully");
		}
		else
			System.out.println("invalid Credentials");
	}
	public String geneartePan(String name, String dob, String gender, String address, long adharNo)
	{
		String mega = name + dob + gender + address + adharNo;
		//System.out.println(mega);
		int cnt=0;
		for(; ;)
		{ // int a=;
					
			
				//if(a<mega.length()) 
				//{
					char ch =mega.charAt(randomGen());
					pan+=ch;
					cnt++;
			//	}
			
		
				if(cnt>=12) 
					return pan;
			}
		
		}
	
	public int randomGen()
	{
		int b =(int)(Math.random()*10);
		
		
		return b;
}
}
public class PanDriver{
	public static void main(String [] args)
	{
		PAN p = new PAN("OMKAR","7MAY2003","MALE","NASHIK",580519297219L);
	p.display();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	p.display();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		p.setAdharNo(p.getPan(),1111111111111L);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		p.display();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
	}
}