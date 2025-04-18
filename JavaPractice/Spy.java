class Spy{
	public static void main(String [] args)
	{
		if(sum(1124)==pro(1124))
			System.out.println("Spy Number");
		else
			System.out.println("Not a Spy Number");
			
	}
public static int sum(int num)
{
	int sum = 0;
	
	for(int i = num ; i!=0 ;  i/=10)
	{
		sum = sum + (i%10);
		num/=10;
	}
	return sum;
}

public static int pro(int num)
{
	int pro = 1;
	for(int i = num; i!=0 ; i/=10)
	{
		pro = pro *(i%10);
		num/=10;
	}
	return pro;
}
}

		