import java.util.Scanner;
public class Evil_Number{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = sc.nextInt();
		String bin = "";
		
		//for loop for binary conversion of number
		
		for(int i = num;i>0;i/=2)
		{
			bin = (i%2) + bin;
		}
		System.out.println("The Binary Conversion is " +bin);
		int count =0;
		for(int i = 0; i<bin.length();i++)
		{	char ch =bin.charAt(i);
			if(ch=='1')
				count++;
		}
		if(count%2==0)
		{
			System.out.println(num+ " is a Evil Number");
		}
		else
		{
			System.out.println(num+ " is Not a Evil Number");
		}
		
		
	}
}