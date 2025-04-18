class Fibo{
	public static void main(String [] args)
	{
	fibo(10);
	}


public static void fibo(int range)
{
	int a = -1;
	int b = 1;
	int result=0;
	for(int i = 1; i<=range ; i++)
	{
		result = a+b;
		System.out.print(result +"  ");
		a=b;
		b=result;
	}
}
}