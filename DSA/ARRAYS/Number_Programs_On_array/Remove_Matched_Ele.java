package arrays;

import java.util.Arrays;

public class Remove_Matched_Ele {

    public static void main(String[] args) {
        int arr1[] = {10, 20, 30, 40, 50, 60};
        int arr2[] = {20, 40, 60, 45, 78, 33};

       int cnt =0;
       for(int i=0; i<arr1.length;i++)
       {
    	   	for(int j=0 ; j<arr2.length ; j++)
    	   	{
    	   		if(arr1[i]==arr2[j])
    	   		{
    	   			cnt++;
    	   		}
    	   	}
       }
    	int ans [] = new int [arr1.length-cnt];
       remove(arr1,arr2,ans);
       
}
 
    public static void remove(int[] arr1, int[] arr2, int[] ans) {
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean matched = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    matched = true;
                    break;
                }
            }
            if (!matched) {
                ans[k++] = arr1[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }

}
