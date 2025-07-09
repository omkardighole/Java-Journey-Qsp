package arrays;

public class Freq_Number {

	public static void main(String[] args) {
		int [] arr = {10,20,30,10,20,10,30,20,30,10,5,10};
		freq(arr);
	}
	
	public static void freq(int [] arr)
	{	int cnt = 0;
			for(int i =0 ;i<arr.length;i++)
			{ int j;
				for( j =0 ;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
						cnt++;
					else
						continue;
				}
				if(cnt>0)
				{
					System.out.println(arr[i] +"---"+cnt);
					cnt=0;
				}
			}
	
	}

}
