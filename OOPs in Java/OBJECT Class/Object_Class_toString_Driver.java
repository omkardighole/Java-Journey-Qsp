 class Student
{
	String name;
	String college;
	int roll;
	String degree;
	String Stream;
	
	public Student(){};
	
	public Student(String name ,String college,int roll, String degree,String Stream)
	{
		super();
		this.name= name;
		this.college= college;
		this.roll= roll;
		this.degree= degree;
		this.Stream= Stream;
	}
	public String toString()
	{
		return "Name : "+name+" ,College: " +college+ ", roll: " + roll+ ",Degeree: " +degree+ " Stream : " +Stream;
	}
}
public class Object_Class_toString_Driver{
	public static void main(String [] args)
	{
		Student s1 = new Student("OMI","KVN",10,"BE","CS");
		System.out.println(s1);
		System.out.println(s1.toString());
	}
}

	
