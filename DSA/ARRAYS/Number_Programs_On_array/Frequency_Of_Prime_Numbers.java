package arrays;
public class Frequency_Of_Prime_Numbers  {

		public static void main(String[] args) {
			int [] arr = {9,2,3,4,5,6,7,8,8,7,6,5,4,3,2,1,2,3,65,4,78,97,8,95,42,13,5,5,556,4,84,463};
			freq(arr);
		}
		
		public static void freq(int [] arr)
		{	int cnt = 0;
				for(int i =0 ;i<arr.length;i++)
				{ 
					if(isPrime(arr[i])) {
						int j;
					for( j =0 ;j<arr.length;j++)
					{
					
						if(arr[i]==arr[j])
							cnt++;
						else
							continue;
					}
					}
					if(cnt>0)
					{
						System.out.println(arr[i] +"---"+cnt);
						cnt=0;
					}
				}
				}
public static boolean isPrime(int n)
{
			if(n<=1)
				return false;
			else {
				for(int i = 2;i<=n/2;i++)
				{
					if(n%i==0)
					{
						return false;
					}
					
				}
			}
			return true;
}
}
			
		

	
