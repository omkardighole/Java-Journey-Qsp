class TechNumber{
	public static void main(String [] args){
		int num =225;
		int len = length(num);
		int div = divisor(len);
		int tech = techNum(div,num);
		
		if(tech==num)
			System.out.println("Tech Number");
		else
			System.out.println("Not a Tech Number");
			
	}
	
	public static int length(int n)
	{
		int cnt = 0;
		for(int i = n; i!=0; i/=10)
			cnt++;
		if(cnt%2==0)
		return cnt;
	else
		return 0;
	}
	public static int divisor(int n)
	{int div=10;
		for(int i = 1; i<=n/2; i++)
		{
			div*=div;
		}
		return div;
	}
	public static int techNum(int div , int n)
	{
		int sum=(n/div) + (n%div);
		int sqr = sum* sum;
		return sum;
	}
}