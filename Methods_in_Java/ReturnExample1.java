class ReturnExample1
{
	public static void main(String [] args )
	{
		
		System.out.println(mergeName("Omkar","Dighole")); //Actual Arguements
		
	}
	public static String mergeName(String fname,String lastName) //Formal Arguements
	{
		String ans= fname + "   " +lastName;
		return ans;
	}
	
}