package Wrapper;

public class Boxing {

    public static void main(String[] args) {
        
        int a = 10;
        Integer i = new Integer(a); // Boxing
        System.out.println(i.toString() + 10); // "1010" (String concat)
        
        char ch = '8';
        Character c = new Character(ch); // Boxing
        System.out.println(c); // 8
        
        Short s = new Short((short)8745); // Fixed
        System.out.println(s); // 8745
        
        Byte b = new Byte((byte)010); // 010 = 8 (octal), casted
        System.out.println(b); // 8
        
        Long l = new Long(7845657878L); // L suffix needed
        System.out.println(l);
        
        Float f = new Float(78.87f); // Use 'f' for float literal
        System.out.println(f);
        
        Double d = new Double(877997.48);
        System.out.println(d);
    }
}
