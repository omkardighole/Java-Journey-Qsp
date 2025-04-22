package Principle_Of_Oop;

 class University {
	
	private String  name ;
	private int code;
	private String colleges;
	private String course;
	private String dean;
	private String add;
	private long contact;
	private String email;
	
	public University() {
		super();
	}

	public University(String name, int code, String colleges, String course, String dean, String add, long contact,
			String email) {
		super();
		this.name = name;
		this.code = code;
		this.colleges = colleges;
		this.course = course;
		this.dean = dean;
		this.add = add;
		this.contact = contact;
		this.email = email;
	}

	public void displayUniversity() {
		System.out.println("University Details"); 
		System.out.println("name =" + name );
		System.out.println(" code=" + code );
		System.out.println( " colleges=" + colleges);
		System.out.println( " course=" + course);
		System.out.println( " dean=" + dean);
		System.out.println(" add=" + add);
		System.out.println( " contact=" + contact );
		System.out.println(" email=" + email);
		
	}
	
}

class College extends University{
	private Sring name;
	private int code;
	private String grade;
	private String principal;
	private long students;
	private String depart;
	private String add;
	private String email;
	
	public College()
	{
		super();
		
	}
	public College(Sring name, int code, String grade, String principal, long students, String depart, String add,
			String email) {
		super();
		this.name = name;
		this.code = code;
		this.grade = grade;
		this.principal = principal;
		this.students = students;
		this.depart = depart;
		this.add = add;
		this.email = email;
	}
	
	public void displayCollege()
	{
		System.out.println("College Details ");
		System.out.println("name : "+name);
		System.out.println(" Code : "+code);
		System.out.println("Grade : "+grade);
		System.out.println("Principal : "+principal);
		System.out.println("Students Number : " +students);
		System.out.println(" Departments : " + depart);
		System.out.println(" Adddress : "+ add);
		System.out.println()"Email : " + email;
	}
	
}

class Department extends College{
	private String name;
	private  String hod;
	private int staff;
	private int students;
	
	public Department()
	{
		super();
	}
	public Department(String name, String hod, int staff, int students) {
		super();
		this.name = name;
		this.hod = hod;
		this.staff = staff;
		this.students = students;
	}
	public void displayDepartment()
	{
		System.out.println("Depart ment Details");
		System.out.println(" NAme :"+name );
		System.out.println("Hod Name : "+hod);
		System.out.println("Staff : "+staff);
		System.out.println("Students : "+ students);
	}
	
}
class Professor extends Department{
	private String name , designation ,education;
	private long contact;
	
	public Professor()
	{
		super();
	}
	public Professor(String name, String designation, String education, long contact) {
		super();
		this.name = name;
		this.designation = designation;
		this.education = education;
		this.contact = contact;
	}
	
	public void displayProf()
	{
		System.out.println("Professor Details:");
		System.out.println("Name : "+name );
		System.out.println("Designation : "+designation);
		System.out.println(" Education : "+education);
		System.out.println(" Contact  : "+contact);
	}
	
}

String name, int code, String colleges, String course, String dean, String add, long contact,
String email
public class Multilevel_Inheritance_Example_University_College_Department_Professor_Driver{
	public static void main()
	{
		Professor professor = new professor("Raj Kumar " , "Senior Prof" , " PHD " , 8756326512L ,//Prof details
											"Computer Department " , "R.m.Shaikh " , 20 ,200 ,//Department
											"LoGMIEER",4093,"B","Dr.K.V.Chandre",10000l,"4 Departments","Nashik","Logmieer@gmail.com"//College
											,"SPPU ",8789,"MAny affiliated","Many","abc sanap", "Pune ", 8956782345l,"ssppu@gmail.com");
		
	}
}
