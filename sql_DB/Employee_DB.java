package sql_DB;

public class Employee_DB {
    private Employee[] employees;
    private int index = 0;
    private String username;
    private String password;
    private boolean connect;
    
    private Employee_DB() {};

    public Employee_DB(String username, String password) {
        this.username = username;
        this.password = password;
        employees = new Employee[20];
    }

    public boolean login(String uname, String pass) {
    		
        if (uname.equals(username) && pass.equals(password))
        {
        		connect =true;
        		return connect;
          
        }
        else 
        {
        		return false;
           
        }
    }
    
    public void showDb()
    {
    		for(int i=0;i<index;i++)
    		{
    			if(employees[i]!=null)
    			{
    				System.out.println(employees[i]);
    			}
    		}
    		
    }

    public void addEmployee(String name, int empid, int deptNo, int managerNo, String job, String hireDate, double sal, double comm) 
    {
        employees[index++] = new Employee(name, empid, deptNo, managerNo, job, hireDate, sal, comm);
    }

    public void searchByJob(String job) 
    {
        System.out.println("Searching by job: " + job);
        for (int i = 0; i < index; i++) 
        {
            if (employees[i].getJob().equalsIgnoreCase(job))
            {
                System.out.println(employees[i]);
            }
        }
    }

    public void searchByDeptNo(int deptNo) 
    {
        System.out.println("Searching by deptNo: " + deptNo);
        for (int i = 0; i < index; i++) 
        {
            if (employees[i].getDeptNo() == deptNo) 
            {
                System.out.println(employees[i]);
            }
        }
    }
    
    public void greater_Salary(double salary)
    {
    		System.out.println("Searching Employee who slary is greater than "+salary);
    		for(int i =0 ; i< index ; i++)
    		{
    			if(employees[i].getSalary()>salary)
    			{
    				System.out.println(employees[i]);
    			}
    		}
    }
    
    public void lesser_Salary(double salary)
    {
    		System.out.println("Searching Employee who slary is lesser than "+salary);
    		for(int i =0 ; i< index ; i++)
    		{
    			if(employees[i].getSalary()<salary)
    			{
    				System.out.println(employees[i]);
    			}
    		}
    }
    
    public void employees_Under_Manager(int deptNo)
    {
    		System.out.println("Searching Employees Working under Manager specified using  DepartMent Number : "+deptNo);
    		for(int i=0; i<index ; i++)
    		{
    			if(employees[i].getDeptNo()==deptNo)
    			{
    				System.out.println(employees[i]);
    			}
    		}
    	
    }
}
