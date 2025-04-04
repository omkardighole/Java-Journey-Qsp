class Student_Parameterized_ConstructorDriver{
	public static void main(String [] args)
	{	
		Student_Parameterized_Constructor s1 = new Student_Parameterized_Constructor("Raju",21,"FC","BE",123);
		s1.displayStudent();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Student_Parameterized_Constructor s2 = new Student_Parameterized_Constructor("omi",22,"KVN","BE",10);
		s2.displayStudent();
		
		System.out.println();
		Student_Parameterized_Constructor s3= new Student_Parameterized_Constructor();
	}
}
		