package arrays;

public class Employe_Arrray_DataBase {
	String name;
	int empId;
	double salary;
	String dept;
	int deptId;

	public Employe_Arrray_DataBase(String name, int empId, double salary, String dept, int deptId) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
		this.deptId = deptId;
	}

	public Employe_Arrray_DataBase() {
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		return "[Name : "+name+ " EMPID: "+empId+ " Salary : "+salary+" Department "+dept + " DEPTID : "+deptId +"]";
	}

}
