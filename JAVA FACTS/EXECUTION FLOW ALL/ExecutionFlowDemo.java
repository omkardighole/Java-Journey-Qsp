public class ExecutionFlowDemo {

    // 🔹 Static Variable
    static int staticVar = initStaticVar();

    // 🔹 Non-static Variable
    int nonStaticVar = initNonStaticVar();
	String a;

    // 🔹 Static Block
    static {
        System.out.println(" Static Block - Starts");
        System.out.println("Static block can access staticVar = " + staticVar);
        System.out.println("Static Block - Ends");
    }

    // 🔹 Non-static Block
    {		System.out.println(a);
        System.out.println(" Non-Static Block - Starts");
        System.out.println("Non-static block can access nonStaticVar = " + nonStaticVar);
        System.out.println(" Non-Static Block - Ends");
    }

    // 🔹 Constructor
    ExecutionFlowDemo(String a) {
		this.a=a;
		System.out.println(a);
        System.out.println(" Constructor - Starts");
        System.out.println("Constructor: nonStaticVar = " + nonStaticVar);
        System.out.println(" Constructor - Ends");
    }

    // 🔹 Main Method
    public static void main(String[] args) {
        System.out.println(" Main Method - Starts");

        // Creating object
        ExecutionFlowDemo obj1 = new ExecutionFlowDemo("Constructor started");

        System.out.println(" Main Method - Ends");
    }

    // 🔹 Static variable initializer method
    static int initStaticVar() {
        System.out.println(" Static Variable Initialization");
        return 100;
    }

    // 🔹 Non-static variable initializer method
    int initNonStaticVar() {
        System.out.println(" Non-Static Variable Initialization");
        return 200;
    }
}

/* Static Variable Initialization
 Static Block - Starts
Static block can access staticVar = 100
 Static Block - Ends
 Main Method - Starts
 Non-Static Variable Initialization
null
 Non-Static Block - Starts
Non-static block can access nonStaticVar = 200
 Non-Static Block - Ends
Constructor started
 Constructor - Starts
Constructor: nonStaticVar = 200
 Constructor - Ends
 Main Method - Ends
*/