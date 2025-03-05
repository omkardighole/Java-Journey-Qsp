class Fibonacci_Recursion{
	public static void main(String [] args)
	{
		fibo(10,-1,1);
	}
	public static void fibo(int n , int n1 , int n2)
	{
		if(n>0)
		{
			int n3 = n1 + n2;
			System.out.print(n3+ " ");
			n1=n2;
			n2=n3;
			fibo( n-1 ,  n1 ,  n2);
		}
		return ;
	}
}