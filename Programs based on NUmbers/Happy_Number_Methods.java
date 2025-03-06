class Happy_Number_Methods{
	 public static void main(String [] args){
		 for(int start =1 ;start<1000; start++)
		 {
			 if(isHappy(start))
				 System.out.print(start+ "  ");
		 }
	 }
	 
	 public static boolean isHappy(int num)
	 {
	 int sum = sumOfSqOfDigit(num);
	 while(sum!= 4 && sum!= 1)
	 {
		 sum = sumOfSqOfDigit(sum);
	 }
	 return sum==1? true:false;
	 }
	 
	 
	 public static int sumOfSqOfDigit(int num)
	 {
		 int sum = 0;
		 while(num!=0)
		 {
			 int last = num %10;
			 sum+=(last * last);
			 num/=10;
		 }
		 return sum;
	 }
}