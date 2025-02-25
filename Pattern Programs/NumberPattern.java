public class NumberPattern{
public static  void main(String [] args){
	for(int i = 5; i>=1; i--){
		for(int k = 1; k<=i; k++){
			int a = i;
			for(int j = 1;j<=i;j++){
				System.out.print(a-- +"*");
			}
			
		}
		System.out.println();
	}
}
}

/*  
pattern
5*4*3*2*1*5*4*3*2*1*5*4*3*2*1*5*4*3*2*1*5*4*3*2*1*
4*3*2*1*4*3*2*1*4*3*2*1*4*3*2*1*
3*2*1*3*2*1*3*2*1*
2*1*2*1*
1*

*/