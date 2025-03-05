import java.util.Scanner;
public class PrimitiveTypeCastingWideningForByte{
  public static void main(String [] args){
	byte b = 10;
	short s = b;

       // char c = b; // possible lossy conversion from byte to char 

	int a = b;
	long l = b;

	float f = b;

	double d = b;
	

System.out.println("Output byte:"+b);

System.out.println("Output short :"+s);

// System.out.println("Output char :"+c );

System.out.println("Output int :"+a );


System.out.println("Output long :"+l);

System.out.println("Output float :"+f);

System.out.println("Output double :"+d);

}
}