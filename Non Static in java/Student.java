class Student{
	String name;
	int age;
	String coll;
	String degree;
	int roll;
	
	Student()
	{
		System.out.println("From no args constructor");
		System.out.println(this);
	}
	
	public void displayStudent()
	{
		String name = "Migthy Raju";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(this);
		
		System.out.println(age);
		System.out.println(coll);
		System.out.println(degree);
		System.out.println(roll);
	}
}
		