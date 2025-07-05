package Wrapper;

public class Object_Method_Overrided_in_Wrapper {

	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println(i1==i2);

		System.out.println(i1.equals(i2));
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		Short s1 = new Short((short)10);
		Short s2 = new Short((short)10);
		System.out.println(i1==i2);

		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Byte b1 = new Byte((byte)10);
		Byte b2 = new Byte((byte)10);
		System.out.println(b1==b2);

		System.out.println(b1.equals(b2));
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		Character c1 = new Character('A');
		Character c2 = new Character('A');
		System.out.println(c1==c2);

		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}

}
