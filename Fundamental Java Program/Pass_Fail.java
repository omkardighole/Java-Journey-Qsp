import java.util.Scanner;
public class Pass_Fail{
	public static void main(String [] args){
		Scanner sc = new Scanner( System.in);
		System.out.print("Enter the Marks of Student: ");
		float marks =sc.nextFloat();
		float per = (marks*100)/600;
		
		
		String ans = (per>=100)?"Invalid Input ":
					 (per>=75)?"Grade A with "+per+"%":
					 (per>=60)?"Grade B with " +per+"%":
					 (per>=35)?"Grade C with "+per+"%":
					 "Failed";
		System.out.println("Student is Passed with :" +ans);
	}
}