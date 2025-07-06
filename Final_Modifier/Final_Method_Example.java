package Final_Modifier;

// ==============================
// Parent class with various final method scenarios
// ==============================

class Final_Method_Example {

    // ✅ Final non-static method: cannot be overridden in child class
    public final void test() {
        System.out.println("Final test() non-static method from parent class");
    }

    // ✅ Final static method: cannot be hidden in child class
    public static final void demo() {
        System.out.println("Final static demo() method from parent class");
    }

    // ❌ Illegal: final + abstract is not allowed because
    // abstract methods require overriding, but final prevents it.
    // public final abstract void abc(); // ❌ CTE

    // ✅ Valid: Non-final, non-static method – can be overridden
    public void overridableMethod() {
        System.out.println("Parent overridable method");
    }

    // ✅ Valid: static method (not final) – can be hidden (not overridden)
    public static void staticMethod() {
        System.out.println("Static method from parent class");
    }
}


// ==============================
// Child class
// ==============================

public class Child extends Final_Method_Example {

    // ❌ Invalid – cannot override final method
    /*
    public void test() {
        System.out.println("Trying to override the final non-static method");
    }
    */

    // ❌ Invalid – cannot hide static final method
    /*
    public static void demo() {
        System.out.println("Trying to hide the static final method");
    }
    */

    // ✅ Valid: Overriding non-final, non-static method
    @Override
    public void overridableMethod() {
        System.out.println("Overridden method in child class");
    }

    // ✅ Valid: Hiding non-final static method (not real overriding)
    public static void staticMethod() {
        System.out.println("Static method from child class");
    }

    // ✅ Valid: Child-specific method
    public void childMethod() {
        System.out.println("Child-specific method");
    }

    // ===========================
    // Main method to test behavior
    // ===========================

    public static void main(String[] args) {
        Child childObj = new Child();

        // Call inherited final method – cannot override
        childObj.test(); // Output: Final test() non-static method from parent class

        // Call inherited final static method – cannot hide
        Child.demo(); // Output: Final static demo() method from parent class

        // Call overridden method
        childObj.overridableMethod(); // Output: Overridden method in child class

        // Call static method – hidden not overridden
        Child.staticMethod(); // Output: Static method from child class

        // Call child-specific method
        childObj.childMethod(); // Output: Child-specific method

        // Reference parent class and observe polymorphism
        Final_Method_Example ref = new Child();
        ref.overridableMethod(); // Output: Overridden method in child class (dynamic binding)

        ref.test(); // Output: Final test() method from parent class (no override)

        Final_Method_Example.staticMethod(); // Output: Static method from parent class
        Child.staticMethod();               // Output: Static method from child class
    }
}
