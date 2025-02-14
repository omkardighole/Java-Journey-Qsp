import java.util.Scanner;
public class PrimitiveTypeCastingWideningForShort{
  public static void main(String [] args){
	
	short s = 1005;

       // char c = b; // possible lossy conversion from byte to char 

	int a = s;
	long l = s;

	float f = s;

	double d = s;
	


System.out.println("Output short :"+s);

System.out.println("Output int :"+a );


System.out.println("Output long :"+l);

System.out.println("Output float :"+f);

System.out.println("Output double :"+d);

}
}