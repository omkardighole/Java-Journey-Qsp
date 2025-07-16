package arrays;

public class Frequency_character_in_Array {

	public static void main(String[] args) {

		 char arr []= {'A','B','C','D','D','A','E','B','Q','C','F','A','X','A','Z'};
		 frequency(arr);
		

	}
	public static void frequency(char [] arr)
	{
		int freq [] = freq(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+ " => Frequency : => "+(freq[i]+1));
		}
		
	}
	public static int [] freq(char arr [])
	{
		int count [] = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int cnt =0;
			for(int j=i+1 ; j<arr.length ; j++)
			{	if(count[i]!=-1) {
				if(arr[i]==arr[j])
				{
					count[j]=-1;
					cnt++;
				}
			}
			count[i]=cnt;
			}
			
		}
		return count;
	}

}
