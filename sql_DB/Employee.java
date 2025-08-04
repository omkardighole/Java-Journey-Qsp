package sql_DB;

public class Employee {
    private String name;
    private int empid;
    private int deptNo;
    private int managerNo;
    private String job;
    private String hireDate;
    private double sal;
    private double comm;

    public Employee(String name, int empid, int deptNo, int managerNo, String job, String hireDate, double sal, double comm) {
        this.name = name;
        this.empid = empid;
        this.deptNo = deptNo;
        this.managerNo = managerNo;
        this.job = job;
        this.hireDate = hireDate;
        this.sal = sal;
        this.comm = comm;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public String getJob() {
        return job;
    }
    
    public double getSalary()
    {
    	return sal;
    }
    
    public int getManagerNo()
    {
    		return managerNo;
    }
    

    @Override
    public String toString() {
        return "[name=" + name + 
               ", empid=" + empid + 
               ", deptNo=" + deptNo + 
               ", Job=" + job + 
               ", Manager=" + managerNo + 
               ", hireDate=" + hireDate + 
               ", sal=" + sal + 
               ", comm=" + comm + "]";
    }
}
