// Define a class named Student
class Student {
    // Instance variables to hold student information
    String name;
    String college;
    int roll;
    String degree;
    String stream;

    // Default constructor (does nothing but needed for object creation without arguments)
    public Student() {}

    // Parameterized constructor to initialize all instance variables
    public Student(String name, String college, int roll, String degree, String stream) {
        this.name = name;         // Assign name to current object
        this.college = college;   // Assign college to current object
        this.roll = roll;         // Assign roll to current object
        this.degree = degree;     // Assign degree to current object
        this.stream = stream;     // Assign stream to current object
    }

    // Overriding hashCode() method from Object class
    // It returns a hash based on values of all instance variables
    @Override
    public int hashCode() {
        return name.hashCode() + college.hashCode() + roll +
               degree.hashCode() + stream.hashCode();
    }

    // Overriding equals() method to compare two Student objects by value
    public boolean equals(Object o) {
        // Cast the incoming object to Student
        Student s = (Student) o;

        //  Using '==' for strings checks reference, not value — should use .equals() instead
        //  Compares all fields; returns true if all match, else false
        if (this.name == s.name && this.college == s.college && this.roll == s.roll &&
            this.degree == s.degree && this.stream == s.stream) {
            return true;
        }
        return false;
    }
}

// Driver class to test Student object behavior
public class Object_Class_hashCode_Driver {
    // Main method - program execution starts here
    public static void main(String[] args) {

        // Create first Student object (s1) with specified values
        Student s1 = new Student("OMI", "KVN", 10, "BE", "CS");

        // Print the hash code of s1 (customized by overridden hashCode())
        System.out.println("S1 hashcode = " + s1.hashCode());

        // Print the object directly — will show className@hash unless toString() is overridden
        System.out.println("S1 = " + s1);

        // Create second Student object (s2) with same values as s1
        Student s2 = new Student("OMI", "KVN", 10, "BE", "CS");

        // Print the hash code of s2 — should match s1 if data is same
        System.out.println("S2 hashCode = " + s2.hashCode());

        // Print s2 object — same as s1 unless toString() is added
        System.out.println("S2 = " + s2);

        // Compare if s1 and s2 refer to same object in memory (false expected)
        System.out.println("Equality operator == -> " + (s1 == s2));

        // Compare content of s1 and s2 using equals() method (true expected if implemented correctly)
        System.out.println("equals method -> " + s1.equals(s2));
    }
}

