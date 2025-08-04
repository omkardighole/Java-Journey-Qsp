package strings;

public class Loading_String_Using_Constructor {

	public static void main(String[] args) {
		
		String s ="hi";
		String t = "hi";
		
		System.out.println("hi".getClass().getName());   //java.lang.String
		System.out.println(s==t);// true 
		System.out.println(s.equals(t));  // true 

		String s1 = new String("hi");
		
		System.out.println(s1.getClass().getName());		//java.lang.String
		
		String s2 = new String("hello");
		
		String s3 = new String("hi");
		
		System.out.println(" compare using == : "+s1==s3);//false
		
		System.out.println(" equals method : "+s1.equals(s3));//true as the toString method is overided 
		
		System.out.println(s.hashCode());// hashcode 3329
		System.out.println(s1.hashCode());// hashcode 3329
		
		System.out.println(s3.hashCode());// hashcode 3329
		
		System.out.println(s2.hashCode());// diff hashcode 99162322
		
		System.out.println(s==s1);// false yety but y
		
		System.out.println(s1==s3);//false  but how  
		System.out.println(s1.equals(s3));// true 
		
		

	}

}
