public class Triangle_by_Tejus_Sir{
	public static void main(String [] args){
		int n =7;
		for(int i = 1; i<=n ; i++)
		{	for(int space = 1; space<=n-i; space++)
			{
				System.out.println(" ");
			}
			for(int star=1; star<=2*i ; star++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}