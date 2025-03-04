public class Methods2{
	public static void main(String [] args){
		
		EvenOdd(4);
		PrimeNumber(4);
		PrimeNumber(3);
		PrimeNumber(7);
		Add(2,3);
		System.out.println(a);
	}
	
	
	public static void EvenOdd(int x)
	{
		System.out.println((x%2==0)?("Even Number"):("Odd Number"));
	}
	
	public static void PrimeNumber(int y)
	{	
		boolean flag = true;
		if(y==1){
			flag= false;
		}
			
			for(int i = 2; i<y; i++){
				if(y%2==0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println("Prime Number");
			}
			else{
				System.out.println("Not a Prime");
			}
		
	}
	public static void Add(int w,int q){
		System.out.println("The Addition is " + (w+q));
	}
	public static void Add(int w,int q){
		System.out.println("The Addition is " + (w+q));
	}
	}
	