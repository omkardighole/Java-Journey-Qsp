import java.util.Scanner ; 
class GoodPrimeNumber_Range
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		for(int i =2;i<=num;i++)
		{
			if(isPrime(i))
			{
				boolean flag = true ;
				for(int j=i;j>0;j/=10)
				{
					if(!isPrime(j%10))
					{
						flag = false;
						break ;
					}
						
				}
				if(flag)
					System.out.print(i+" ");
			}
		}
	}
	public static boolean isPrime(int num)
	{
		if(num<2)
			return false;
		for(int i =2;i<num ; i++)
			if(num%i==0)
				return false ; 
		return true ; 
	}
}
