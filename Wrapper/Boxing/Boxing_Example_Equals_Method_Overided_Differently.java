package Wrapper;

public class Boxing_Example_Equals_Method_Overided_Differently {

    public static void main(String[] args) {
        Byte b = new Byte((byte) 100);
        Short s = new Short((short) 100);
        Integer i = new Integer(100);
        Long l = new Long(100L);
        Float f = new Float(100.0f);
        Double d = new Double(100.0);
        Character c = new Character((char) 100);

        System.out.println("✅ Same-type comparisons (should be true):");
        System.out.println("b.equals(new Byte((byte)100)) → " + b.equals(new Byte((byte)100)));
        System.out.println("s.equals(new Short((short)100)) → " + s.equals(new Short((short)100)));
        System.out.println("i.equals(new Integer(100)) → " + i.equals(new Integer(100)));
        System.out.println("l.equals(new Long(100L)) → " + l.equals(new Long(100L)));
        System.out.println("f.equals(new Float(100.0f)) → " + f.equals(new Float(100.0f)));
        System.out.println("d.equals(new Double(100.0)) → " + d.equals(new Double(100.0)));
        System.out.println("c.equals(new Character((char)100)) → " + c.equals(new Character((char)100)));

        System.out.println("\n❌ Cross-type comparisons (should be false):");
        System.out.println("b.equals(s) → " + b.equals(s));
        System.out.println("b.equals(i) → " + b.equals(i));
        System.out.println("b.equals(l) → " + b.equals(l));
        System.out.println("b.equals(f) → " + b.equals(f));
        System.out.println("b.equals(d) → " + b.equals(d));
        System.out.println("b.equals(c) → " + b.equals(c));

        System.out.println("s.equals(i) → " + s.equals(i));
        System.out.println("s.equals(l) → " + s.equals(l));
        System.out.println("s.equals(f) → " + s.equals(f));
        System.out.println("s.equals(d) → " + s.equals(d));
        System.out.println("s.equals(c) → " + s.equals(c));

        System.out.println("i.equals(l) → " + i.equals(l));
        System.out.println("i.equals(f) → " + i.equals(f));
        System.out.println("i.equals(d) → " + i.equals(d));
        System.out.println("i.equals(c) → " + i.equals(c));

        System.out.println("l.equals(f) → " + l.equals(f));
        System.out.println("l.equals(d) → " + l.equals(d));
        System.out.println("l.equals(c) → " + l.equals(c));

        System.out.println("f.equals(d) → " + f.equals(d));
        System.out.println("f.equals(c) → " + f.equals(c));

        System.out.println("d.equals(c) → " + d.equals(c));
    }
}
