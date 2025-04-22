package Principle_Of_Oop.Inheritance_By_Shrikant;

public class Hierarchical_Inheritance_Google {
    public static void main(String[] args) {
        GoogleDrive drive = new GoogleDrive("Omkar", "Dighole", "Omihdj@gmail.com", "Nashik",
                8795698545L, "07/05/2003", "omkar3212", "male",
                100, 512, "Folder C");

        GooglePay pay = new GooglePay("Omkar", "Dighole", "Omihdj@gmail.com", "Nashik",
                8795698545L, "07/05/2003", "omkar3212", "male",
                "Omkar D", "Union Bank", "7665444@apl", 458799865L);

        GoogleClassroom classroom = new GoogleClassroom("Omkar", "Dighole", "Omihdj@gmail.com", "Nashik",
                8795698545L, "07/05/2003", "omkar3212", "male",
                "Java Classroom", 2345, "JAVA", 77, "Shrikant Sir", "http://jdhkdkdw.com");

        // Display all
        drive.display();
        drive.displayDrive();

        pay.display();
        pay.displayGooglePay();

        classroom.display();
        classroom.displayClassroom();
    }
}

// Base class
class Google {
    private String firstName, lastName, email, add, dob, password, gender;
    private long contact;

    public Google(String firstName, String lastName, String email, String add, long contact, String dob, String password, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.add = add;
        this.contact = contact;
        this.dob = dob;
        this.password = password;
        this.gender = gender;
    }

    public void display() {
        System.out.println("\nGOOGLE ACCOUNT DETAILS");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Address: " + add);
        System.out.println("Contact: " + contact);
        System.out.println("DOB: " + dob);
        System.out.println("Password: " + password);
        System.out.println("Gender: " + gender);
    }
}

// Google Drive subclass
class GoogleDrive extends Google {
    private int availableStorage, totalSpace;
    private String folder;

    public GoogleDrive(String firstName, String lastName, String email, String add,
                       long contact, String dob, String password, String gender,
                       int availableStorage, int totalSpace, String folder) {
        super(firstName, lastName, email, add, contact, dob, password, gender);
        this.availableStorage = availableStorage;
        this.totalSpace = totalSpace;
        this.folder = folder;
    }

    public void displayDrive() {
        System.out.println("\nGOOGLE DRIVE DETAILS");
        System.out.println("Available Storage: " + availableStorage + "MB");
        System.out.println("Total Space: " + totalSpace + "MB");
        System.out.println("Folder: " + folder);
    }
}

// Google Pay subclass
class GooglePay extends Google {
    private String name, bank, upiId;
    private long phone;

    public GooglePay(String firstName, String lastName, String email, String add,
                     long contact, String dob, String password, String gender,
                     String name, String bank, String upiId, long phone) {
        super(firstName, lastName, email, add, contact, dob, password, gender);
        this.name = name;
        this.bank = bank;
        this.upiId = upiId;
        this.phone = phone;
    }

    public void displayGooglePay() {
        System.out.println("\nGOOGLE PAY DETAILS");
        System.out.println("Name: " + name);
        System.out.println("Bank: " + bank);
        System.out.println("UPI ID: " + upiId);
        System.out.println("Phone: " + phone);
    }
}

// Google Classroom subclass
class GoogleClassroom extends Google {
    private String className, subject, trainer, link;
    private int code, studentCount;

    public GoogleClassroom(String firstName, String lastName, String email, String add,
                           long contact, String dob, String password, String gender,
                           String className, int code, String subject, int studentCount, String trainer, String link) {
        super(firstName, lastName, email, add, contact, dob, password, gender);
        this.className = className;
        this.code = code;
        this.subject = subject;
        this.studentCount = studentCount;
        this.trainer = trainer;
        this.link = link;
    }

    public void displayClassroom() {
        System.out.println("\nGOOGLE CLASSROOM DETAILS");
        System.out.println("Class Name: " + className);
        System.out.println("Class Code: " + code);
        System.out.println("Subject: " + subject);
        System.out.println("Student Count: " + studentCount);
        System.out.println("Trainer: " + trainer);
        System.out.println("Link: " + link);
    }
}
    