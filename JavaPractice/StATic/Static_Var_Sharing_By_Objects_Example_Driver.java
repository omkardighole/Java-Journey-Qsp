class Static_Var_Sharing_By_Objects_Example{
		static int balance ;
		
	public Static_Var_Sharing_By_Objects_Example()
	{
		balance+=1000;
	}
	public void display()
	{
		System.out.println(balance);
	}
}
public class Static_Var_Sharing_By_Objects_Example_Driver{
	public static void main(String [] args)
	{
		Static_Var_Sharing_By_Objects_Example obj1 = new Static_Var_Sharing_By_Objects_Example();
		obj1.display();
		
		Static_Var_Sharing_By_Objects_Example obj2 = new Static_Var_Sharing_By_Objects_Example();
		obj2.display();
		
		Static_Var_Sharing_By_Objects_Example obj3 = new Static_Var_Sharing_By_Objects_Example();
		obj3.display();
	}
}