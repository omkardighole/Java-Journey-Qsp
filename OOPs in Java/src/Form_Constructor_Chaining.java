class Form_Constructor_Chaining{
	String name;
	long phno;
	long tel;
	char gen;
	String blood;
	String email;
	String dob;
	
	Form_Constructor_Chaining()									//Constructor Overloading Example
	{ };
	
	Form_Constructor_Chaining(String name,long phno,char gen ,String dob)   //mandatory info
	{
		this.name=name;
		this.phno=phno;
		this.gen=gen;
		this.dob=dob;
	}
	
	Form_Constructor_Chaining(String name,long phno,char gen ,String dob , long tel )   
	{
		this(name,phno,gen,dob);
		this.tel=tel;   //optional
	}
	
	Form_Constructor_Chaining(String name,long phno,char gen ,String dob , long tel , String blood )   
	{
		this(name,phno,gen,dob);
		this.tel=tel; 		//optional
        this.blood=blood;		//optional
	}
	
	Form_Constructor_Chaining(String name,long phno,char gen ,String dob , long tel , String blood , String email )   
	{
		this(name,phno,gen,dob);
		this.tel=tel; 		//optional
        this.blood=blood;		//optional
		this.email=email;		//optional
	}
	
	public void displayForms()
	{
		System.out.println("NAme: " +name);
		System.out.println("Phone Number: " +phno);
		System.out.println("Gender: " +gen);
		System.out.println("DOB: " +dob);
		System.out.println("TEL: " +tel);
		System.out.println("Blood Group : " +blood);
		System.out.println("Email: " +email);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}