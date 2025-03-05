import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username1 = null;
        String password1 = null;
        String address = null;
        long contact = 0;
        double balance = 0.0;

        for (;;) {
            System.out.println();
            System.out.println("          WELCOME                 ");
            System.out.println();
            System.out.println("1. Existing User");
            System.out.println("2. Create Account");
            System.out.println("Enter an Option:");
            int opt = sc.nextInt();
            System.out.println();

            if (opt == 1) {
                if (username1 == null) {
                    System.out.println("Create Your Account First");
                    continue;
                }
                System.out.println("LOGIN");
                System.out.println();

                for (int i = 3; i >= 1; i--) {
                    System.out.println();
                    System.out.println("Username:");
                    String username = sc.next();
                    System.out.println("Password:");
                    String password = sc.next();

                    if (username.equals(username1) && password.equals(password1)) {
                        home: // label for loop
                        for (;;) {
                            System.out.println();
                            System.out.println("1. Deposit");
                            System.out.println("2. Withdraw");
                            System.out.println("3. Check Balance");
                            System.out.println("4. Mini Statement");
                            System.out.println("5. Logout");
                            System.out.println();
                            System.out.println("Enter an Option:");
                            int opt1 = sc.nextInt();
                            System.out.println();

                            switch (opt1) {
                                case 1: {
                                    System.out.println("Deposit");
                                    System.out.println();
                                    System.out.println("Enter the Amount:");
                                    double depositAmt = sc.nextDouble();
                                    balance += depositAmt;
                                    System.out.println("Amount Deposited Successfully");
                                    System.out.println();
                                    break;
                                }
                                case 2: {
                                    System.out.println("Withdraw");
                                    System.out.println();
                                    System.out.println("Enter the Amount:");
                                    double withdraw = sc.nextDouble();
                                    System.out.println("Enter the PIN:");
                                    String password3 = sc.next();
                                    if (password3.equals(password1)) {
                                        if (withdraw <= balance) {
                                            balance -= withdraw;
                                            System.out.println("Amount Debited Successfully");
                                        } else {
                                            System.out.println("Insufficient Balance");
                                        }
                                    } else {
                                        System.out.println("Wrong PIN");
                                    }
                                    break;
                                }
                                case 3: {
                                    System.out.println("Check Balance");
                                    System.out.println();
                                    for (int j = 3; j >= 1; j--) {
                                        System.out.println();
                                        System.out.println("Enter the PIN:");
                                        String password2 = sc.next();
                                        if (password2.equals(password1)) {
                                            System.out.println("Account Balance: " + balance + " Rs ");
                                            continue home;
                                        } else {
                                            System.out.println("Wrong PIN");
                                            System.out.println("Attempts left: " + (j - 1));
                                        }
                                    }
                                    System.out.println("Your Account Has Been Blocked For 24 hrs");
                                    System.exit(0);
                                    break;
                                }
                                case 4: {
                                    System.out.println("Mini Statement");
                                    break;
                                }
                                case 5: {
                                    System.out.println("Thank You For Using Our App");
                                    System.out.println("Visit Again");
                                    System.exit(0);
                                }
                                default:
                                    System.out.println("Invalid Option");
                            }
                        }
                    } else {
                        System.out.println("Invalid Credentials");
                        System.out.println("Attempts left: " + (i - 1));
                    }
                }
                System.out.println("Thank You, and Never Visit Again");
                System.exit(0);
            } else if (opt == 2) {
                System.out.println();
                System.out.println("Account Creation");
                System.out.println("Username:");
                username1 = sc.next();
                System.out.println("Password:");
                password1 = sc.next();
                System.out.println("Address:");
                sc.nextLine(); // Consume leftover newline
                address = sc.nextLine();
                System.out.println("Contact:");
                contact = sc.nextLong();
                System.out.println("Deposit Amount:");
                balance = sc.nextDouble();
                System.out.println();
                System.out.println("Account Created Successfully");
            } else {
                System.out.println("Invalid Option");
            }
        }
    }
}
