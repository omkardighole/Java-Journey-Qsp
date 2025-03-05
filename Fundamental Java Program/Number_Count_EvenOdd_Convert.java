import java.util.Scanner;
public class Number_Count_EvenOdd_Convert{
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Number:");
	int num = sc.nextInt();
	int count=0;
	int rem2=0;
	int newNum=0;
	while(num>0){
	
		count++;
	
	System.out.println(count);
	if(count%2==0){   //even count
		while(num>0){
		rem2=num%10;
		
		
		if(rem2%2!=0){  	//conver odd number in even count
		      newNum=  ++rem2+newNum;
			    
		}
 
		
			
		}	
	System.out.println(rem2);
}
}

}
}