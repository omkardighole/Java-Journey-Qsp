class Count_Of_Number_Recursion{
	public static void main(String [] args)
	{
		System.out.print(count(12345,0));
	}
	
	public static int count (int num  ,int ct)
	{
		if(num==0)
		{
			return ct;
		}
		return count(num/10,++ct);
	}
}