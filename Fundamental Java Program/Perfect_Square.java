import java.util.Scanner;
public class Perfect_Square{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		for(int i = 1; i<=num;i++){
			int square = i*i;
			if(square>num){
				System.out.println("No Perfect Square Exist");
				break;
			}
			else if(square==num){
				System.out.println(i+ "  is Perfect Square of  " +num);
				break;
				
			}
			
		}
		
	}
}
		