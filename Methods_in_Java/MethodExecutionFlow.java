public class MethodExecutionFlow{
	public static void main(String [] args){
		System.out.println("Main Start");
		add('a',10);
		division(100.0,50.0);
		System.out.println("Main End");
	}
	public static void add(int a , int b)
	{
		System.out.println("Add Start");
		int res = a+b;
		System.out.println(res);
		System.out.println("Add End");
	}
	public static void division(double num,double den)
	{
		System.out.println("Division  Start");
		double res = num/den;
		System.out.println(res);
		System.out.println("Division End");
	}
}