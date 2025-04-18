public class LenZ{
	public static void main(String [] args)
	{
		int num = 1000047;
		int a= ZeroReplacer(num);
		System.out.println("The Number " +num+  " Replaced With Zero is : " + ZeroReplacer(a));
	}
	public static int ZeroReplacer(int num)
	{
		int rev = 0;
		for(int i = num ; i!=0 ; i/=10)
		{	if(i%10==0)
				rev = rev * 10 +5;
			
			else
				rev = rev *10 +(i%10);
		}
		return rev;
	}
}
