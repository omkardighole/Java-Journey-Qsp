package arrays;

public class Frequency_Of_ELE_BY_SIR {

	public static void main(String[] args) {
		
		int arr []  = {1,2,3,1,3,4,5,3,4,5,6,7,8,6,9};
		int cnt [] = new int[arr.length];
		
		
		
		for(int i=0;i<arr.length;i++)
		{int count=0;
			if(cnt[i]!=-1)
			{
				for(int j=i+1; j<arr.length ; j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						cnt[j]=-1;
					}
				}
			
			cnt[i]=count;
			}
		}
		for(int i =0;i<cnt.length;i++)
		{
			if(cnt[i]!=-1)
			{
				System.out.println(arr[i] + "  ===    " + cnt[i]);
			}
		}

	}

}
