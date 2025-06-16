// Parent class
class Method_variable_Shadowing1 {
    int a = 10;               // Instance variable
    static int b = 100;       // Static variable

    // Static method (can be shadowed, not overridden)
    public static void demo() {
        System.out.println("From static demo method in parent class");
    }

    // Non-static method (can be overridden)
    public void test() {
        System.out.println("From non-static test method from parent class");
    }
}

// Child class
class Method_variable_Shadowing2 extends Method_variable_Shadowing1 {
    String a = "hi";          // Shadows parent instance variable
    static String b = "bye";  // Shadows parent static variable

    // Static method shadowing
    public static void demo() {
        System.out.println("From static demo method in child class");
    }

    // Non-static method overriding
    public void test() {
        System.out.println("From non-static test method from child class");
    }
}

// Driver class
public class Method_variable_Shadowing_Driver {
    public static void main(String[] args) {
        
        // Upcasting: Reference is of parent type, object is child
        Method_variable_Shadowing1 obj1 = new Method_variable_Shadowing2();

        // Static method call – method shadowing (depends on reference type)
        obj1.demo();  // Output: From static demo method in parent class

        // Non-static method – method overriding (depends on object type)
        obj1.test();  // Output: From non-static test method from child class

        // Variable shadowing – resolved by reference type, not object type
        System.out.println(obj1.a); // Output: 10 (int) — parent instance variable
        System.out.println(obj1.b); // Output: 100 (int) — parent static variable
    }
}
