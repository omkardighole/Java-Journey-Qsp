package Principle_Of_Oop;

public class StudentEncapsulation {

	private String institute = "Qspiders";
	private String name;
	private String course;
	private double fees;
	private String branch ;
	private double cgpa;
	private String degree;
	private double sscPer; 
	private double hscPer;
	private long phno;
	
	 StudentEncapsulation(String name ,String course , double fees ,String branch ,double cgpa , String degree ,double sscPer  ,double hscPer , long phno)
			{
		this.name=name;
		this.course=course;
		this.fees=fees;
		this.branch=branch;
		this.cgpa=cgpa;
		this.degree=degree;
		this.sscPer=sscPer;
		this.hscPer=hscPer;
		this.phno=phno;
		
		System.out.println(name+ " Student Registered");
		
			}
	public String getInstituteName()
	{
		return institute;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getCourse()
	{
		return course;
	}
	public double getFees()
	{
		return fees;
	}
	
	public String getBranch()
	{
		return branch;
		
	}
	public double getCga()
	{
		return cgpa;
	}
	public String getdegree()
	{
		return degree;
	}
	public  double getSscPer()
	{
		return sscPer;
		
	}
	public double getHscPer()
	{
		return hscPer;
	}
	public long getPhno()
	{
		return phno;
	}
	
	public void setBranch(String branch ,boolean permis)
	{
		if(permis)
		{
			this.branch=branch;
			System.out.println("Branch Updated Successfully to : " +branch);
		}
		else
		{
			System.out.println("Take Permissison From the Trainer");
		}
		
	}
	
	public void courseChange(long phno , String course)
	{
		if(this.phno==phno)
		{
			this.course=course;
			System.out.println("Course updated Successfully : "+course);
		}
		else
		{
			System.out.println("Mobile Number is Inavlid");
		}
	}
	
}
