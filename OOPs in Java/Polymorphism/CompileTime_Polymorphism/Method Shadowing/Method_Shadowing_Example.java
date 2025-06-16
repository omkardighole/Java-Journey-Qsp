// Superclass with a static method
class Parent {
    static void display() {
        System.out.println("Static method from Parent");
    }
}

// Subclass with a static method having the same signature
class Child extends Parent {
    static void display() {
        System.out.println("Static method from Child");    //if i used non static methods method overiding will occur
    }
}

public class Method_Shadowing_Example {
    public static void main(String[] args) {
        // Reference is of type Parent, object is of type Child
        Parent p = new Child();

        // This will call Parent's static method because static methods are resolved
        // at compile time based on the reference type, not the object type.
        p.display();  // Output: Static method from Parent
    }
}
