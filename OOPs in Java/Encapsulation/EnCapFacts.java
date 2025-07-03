public class ConceptDemo {

    // 🔒 Static field (shared by all instances)
    private static String staticValue;

    // 🔒 Instance field (unique per object)
    private String instanceValue;

    // ✅ Static block – runs once when class is loaded
    static {
        staticValue = "Initialized in static block";
        System.out.println("Static Block: staticValue = " + staticValue);
    }

    // ✅ Constructor – runs each time an object is created
    public ConceptDemo(String staticVal, String instanceVal) {
        // ⚠️ Static field being set inside constructor (technically allowed, but not good practice)
        staticValue = staticVal;  // ❗Overwrites shared value
        this.instanceValue = instanceVal;
        System.out.println("Constructor: staticValue = " + staticValue + ", instanceValue = " + this.instanceValue);
    }

    // ✅ Static getter for static field
    public static String getStaticValue() {
        return staticValue;
    }

    // ✅ Static setter for static field
    public static void setStaticValue(String value) {
        staticValue = value;
    }

    // ✅ Non-static getter for instance field
    public String getInstanceValue() {
        return instanceValue;
    }

    // ❌ Invalid: trying to use `this` in static method (uncomment to see error)
    // public static void invalidStaticMethod() {
    //     System.out.println(this.instanceValue); // ❌ Error: Cannot use 'this' in static context
    // }

    // ✅ Static method can be called without object
    public static void staticHello() {
        System.out.println("Hello from static method!");
    }

    // ✅ Non-static method requires object
    public void instanceHello() {
        System.out.println("Hello from instance method!");
    }

    public static void main(String[] args) {

        // ✅ Call static method directly using class name (best practice)
        ConceptDemo.staticHello();

        // ❌ Accessing non-static field from static method — not allowed
        // System.out.println(instanceValue); // ❌ Error

        // ✅ Creating object and initializing both static and instance values
        ConceptDemo obj1 = new ConceptDemo("Overwritten by obj1", "Omkar");

        // ✅ Creating another object (watch how staticValue gets overwritten again)
        ConceptDemo obj2 = new ConceptDemo("Overwritten by obj2", "Ravi");

        // ✅ Accessing static field via class (correct way)
        System.out.println("Access via class: staticValue = " + ConceptDemo.getStaticValue());

        // ✅ Accessing static method via object (allowed, but not preferred)
        obj1.staticHello();

        // ✅ Accessing instance field via object
        System.out.println("Instance of obj1: " + obj1.getInstanceValue());
        System.out.println("Instance of obj2: " + obj2.getInstanceValue());

        // ✅ Calling instance method
        obj1.instanceHello();

        // ❌ Constructor cannot be static (uncomment to see error)
        // public static ConceptDemo() {} // ❌ ERROR

        // ❌ Can't access `this` in static method
        // staticHello() can't use instanceValue or this
    }
}
