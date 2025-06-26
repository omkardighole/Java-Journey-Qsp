// Base class
class Doctor {
    String name;
    int age;
    int exp;
    String degree;
    String hospitalName;

    // Constructor to initialize all attributes
    public Doctor(String name, int age, int exp, String degree, String hospitalName) {
        this.name = name;
        this.age = age;
        this.exp = exp;
        this.degree = degree;
        this.hospitalName = hospitalName;
    }

    // Method to display base class attributes
    public void displayDoctor() {
        System.out.println("Name          : " + name);
        System.out.println("Age           : " + age);
        System.out.println("Experience    : " + exp + " years");
        System.out.println("Degree        : " + degree);
        System.out.println("Hospital Name : " + hospitalName);
    }
}

// Derived class 1
class Cardiologist extends Doctor {
    String spec;
    String organ;

    public Cardiologist(String name, int age, int exp, String degree, String hospitalName, String spec, String organ) {
        super(name, age, exp, degree, hospitalName);
        this.spec = spec;
        this.organ = organ;
    }

    public void displayCardiologist() {
        displayDoctor(); // Call base class method
        System.out.println("Specialization: " + spec);
        System.out.println("Organ Focused : " + organ);
    }
}

// Derived class 2
class Orthopediac extends Doctor {
    String spec;
    String organ;

    public Orthopediac(String name, int age, int exp, String degree, String hospitalName, String spec, String organ) {
        super(name, age, exp, degree, hospitalName);
        this.spec = spec;
        this.organ = organ;
    }

    public void displayOrthopediac() {
        displayDoctor(); // Call base class method
        System.out.println("Specialization: " + spec);
        System.out.println("Organ Focused : " + organ);
    }
}

// Main class
public class DoctorDriver {
    public static void main(String[] args) {
        // Creating Cardiologist object
        Cardiologist c = new Cardiologist("Omkar", 22, 3, "MBBS", "Om Sai Hospital", "Cardiologist", "Heart");
        c.displayCardiologist();

        System.out.println();

        // Creating Orthopediac object
        Orthopediac o = new Orthopediac("Ram", 32, 7, "BHMS", "Sai Hospital", "Orthopediac", "Bones");
        o.displayOrthopediac();
    }
}
