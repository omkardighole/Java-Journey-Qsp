class BankAccount {
    String name, bankName, ifsc, branch;
    long accNo, phno;
    int pin;

    public BankAccount() {}

    public BankAccount(String name, String bankName, String ifsc, String branch, long accNo, long phno, int pin) {
        this.name = name;
        this.bankName = bankName;
        this.ifsc = ifsc;
        this.branch = branch;
        this.accNo = accNo;
        this.phno = phno;
        this.pin = pin;
    }

    public void displayBankAccount() {
        System.out.println("Name: " + name);
        System.out.println("Bank: " + bankName);
        System.out.println("IFSC: " + ifsc);
        System.out.println("Branch: " + branch);
        System.out.println("Account Number: " + accNo);
        System.out.println("Phone: " + phno);
        System.out.println("PIN: " + pin);
    }
}

class SavingAccount extends BankAccount {
    double balance;
    double interest;
    String type;

    public SavingAccount() {}

    public SavingAccount(String name, String bankName, String ifsc, String branch, long accNo, long phno, int pin,
                         double balance, double interest, String type) {
        super(name, bankName, ifsc, branch, accNo, phno, pin); // Call to superclass constructor
        this.balance = balance;
        this.interest = interest;
        this.type = type;
    }

    public void displaySavingAccount() {
        displayBankAccount();
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interest + "%");
        System.out.println("Account Type: " + type);
    }
}

public class BankDriver {
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount("Omkar", "Union Bank Of India", "UBIN0120", "Naigaon",
                46665854866L, 79659845656L, 1234, 50000.0, 10.50, "Saving Account");

        System.out.println("Bank Account Details:");
        s1.displayBankAccount();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Saving Account Details:");
        s1.displaySavingAccount();
    }
}
