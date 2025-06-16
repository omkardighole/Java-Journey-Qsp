class Method_Overloading_Static_and_Non_Static {

    // Static method - version 1
    static void greet() {
        System.out.println("Hello from static method (no args)");
    }

    // Static method - version 2 (overloaded)
    static void greet(String name) {
        System.out.println("Hello " + name + " from static method");
    }

    // Non-static method - version 3 (overloaded)
    void greet(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello from non-static method");
        }
    }
}

public class  Method_Overloading_Static_and_Non_Static_Driver{
    public static void main(String[] args) {
        // Calling static methods
        Method_Overloading_Static_and_Non_Static.greet();                  // Output: Hello from static method (no args)
        Method_Overloading_Static_and_Non_Static.greet("Omkar");           // Output: Hello Omkar from static method

        // Calling non-static method
        Method_Overloading_Static_and_Non_Static d = new Method_Overloading_Static_and_Non_Static();
        d.greet(2);                    // Output: Hello from non-static method (x2)
    }
}
