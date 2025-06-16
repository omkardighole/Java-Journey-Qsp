class Parent {
    // Static variable in Parent
    static String bankName = "Parent Bank";

    // Non-static (instance) variable in Parent
    int rate = 5;
}

class Child extends Parent {
    // Static variable in Child (shadows Parent's static variable)
    static String bankName = "Child Bank";

    // Non-static (instance) variable in Child (shadows Parent's variable)
    int rate = 7;

    void display() {
        // Accessing shadowed variables
        System.out.println("Child's static bankName: " + bankName);         // Child's static
        System.out.println("Parent's static bankName: " + super.bankName);  // Parent's static

        System.out.println("Child's rate: " + rate);           // Child's instance variable
        System.out.println("Parent's rate: " + super.rate);    // Parent's instance variable
    }
}

public class Variable_Shadowing_Example {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
