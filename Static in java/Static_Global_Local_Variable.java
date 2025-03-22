class Static_Global_Local_Variable{
	
	static String s;    //global Variable
	
	public static void main(String [] args)
	{
		System.out.println(s);   //null
		
		demo();
		
		String s = "Tejus";  //local variable
		
		System.out.println(s);
		
		System.out.println(Static_Global_Local_Variable.s);
	}
	
	public static void demo()
	{
		s="Qspiders";
		System.out.println(s);
	}
}

		
		
		