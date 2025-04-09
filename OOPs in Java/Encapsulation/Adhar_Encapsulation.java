package Principle_Of_Oop;
import java.util.*;

public class Adhar_Encapsulation {
	
	private String name;
	private String dob;
	private String gender;
	private String address;
	private long adharNo;
	private int virtualId;
	
	 Adhar_Encapsulation(String name, String dob , String gender , String address , long adharNo)
			{
				this.name = name;
				this.dob = dob;
				this.gender = gender;
				this.address = address;
				this.adharNo = adharNo;
		
			}
	public String getName()
	{
		return name;
	}
	
	public long getAdharNo()
	{
		return adharNo;
	}
	
	public String getDob()
	{
		return dob;
	}
	
	public void setDob(String newDob , long adharNo)
	{
		if(this.adharNo == adharNo)
		{
			dob=newDob;
			System.out.println("DOB Updated Succesfully :" +dob);
		}
		else
		{
			System.out.println("Invald AdharNumber");
		}
			
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String newGender  , long adharNo)
	{
		if(this.adharNo==adharNo)
		{
			gender=newGender;
			System.out.println("Gender Updated Succesfully : "+gender);
		}
		else
		{
			System.out.println("Invalid Adhar Number");
		}
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String newAddress , long adharNo)
	{
		if(this.adharNo==adharNo)
		{
			address = newAddress;
			System.out.println("Address Updated Succesfully : "+address);
		}
		else
		{
			System.out.println("Adhar Number Not existed");
		}
	}
	
	public void setVirtualId(long adharNo)
	{
		if(this.adharNo==adharNo)
		{
			this.virtualId=((int)(Math.random()*100000000));
			System.out.println("Your Virtual Id is : "+virtualId);
		}
//		else
//		{
//			System.out.println("Adhar Number Invalid ");
//			System.out.println("Virtual Id Generation Failed RETRY ");
//			
//		}
	}
	
	

}
