package Final_Modifier;

public class Non_Static_Final_Variable {
    
    // Final non-static variable initialized in non-static block
    final int non_Static_Variable;

    {
        non_Static_Variable = 45;
    }

    // Final non-static variable initialized at declaration
    final int c = 10;

    // Final non-static variable initialized in constructor
    final int z;

    // Final non-static variable initialized in constructor
    final int w;

    // Default constructor (not used in this example)
    public Non_Static_Final_Variable() {
        // z and w not initialized here → Would cause CTE if used
        z = 0;
        w = 0;
    }

    // Constructor initializing both z and w
    public Non_Static_Final_Variable(int z, int w) {
        this.z = z;
        this.w = w;
    }

    public static void main(String[] args) {
        Non_Static_Final_Variable obj2 = new Non_Static_Final_Variable(5, 7);
        
        System.out.println("z = " + obj2.z);
        System.out.println("w = " + obj2.w);
        System.out.println("c = " + obj2.c);
        System.out.println("non_Static_Variable = " + obj2.non_Static_Variable);
    }
}
