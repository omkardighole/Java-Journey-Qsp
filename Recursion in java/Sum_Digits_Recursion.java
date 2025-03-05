class Sum_Digits_Recursion{
	public static void main(String [] args){
		System.out.print(sumofDigits(12345,0));
	}
	public static int sumofDigits(int num , int sum)
	{
		return num==0? sum:sumofDigits(num/10,sum+=(num%10));
	}
}