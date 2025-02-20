import java.util.Scanner;
public class Fascinating_Number{
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Three Digit Number:");
	int num = sc.nextInt();
	String str = num+ " "+(num*2)+(num*3);
	boolean flag = true;
	//loop from 1 to 9 characters
	for(char i = '1';i<='9';i++)
	{
		int cnt = 0;//int i char count is equals to zero for every    new character 
		//fetch char from string one by one from 0 index
		
		for(int j=0;j<str.length();j++)
		{
			char ch = str.charAt(j);//char fetched is stored in var ch 
			if(ch==i) //if i char matches with ch char if executes
			cnt++;//increment the count if cnt satisfy
			
		}
		if(cnt!=1 || cnt>1)//if cnt of char is not equals to 1 then if executes
		{
			flag = false;//re initilize the flag is cnt is not equals to  1
			break;
			// terminate the loop
		}
	}
	if(flag){
		System.out.println(num+" is a Fascinating Number");
	}
	else{
		System.out.println(num+ " is not a Fascinating Number");
	}
}
}