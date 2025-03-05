class Count_Of_Number_Recursion_Conditional_Operator{
	public static void main(String [] args)
	{
		System.out.print(count(12345,0));
	}
	
	public static int count (int num  ,int ct)
	{
		return num==0? ct:count(num/10,++ct);
	}
}