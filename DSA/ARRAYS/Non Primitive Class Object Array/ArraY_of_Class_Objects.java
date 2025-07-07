package arrays;

public class ArraY_of_Class_Objects {
	String name;
	String college;
	int age ;
	int id;

	public ArraY_of_Class_Objects() {
		// TODO Auto-generated constructor stub

	}

	public ArraY_of_Class_Objects(String name, String college, int age, int id) {
		super();
		this.name = name;
		this.college = college;
		this.age = age;
		this.id = id;
	}

	public String toString()
	{
		return "[Name: "+name+ " College: "+college+ " Age: "+age+ " id : "+id+ " ]";
	}
	
}
