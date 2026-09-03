import java.util.Scanner;

public class bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Account Details
        String studentName;
        String studentId;
        long accountNumber;
        double balance;

        // Account Creation
        System.out.println("========== STUDENT BANK SYSTEM ==========");

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Student ID: ");
        studentId = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLong();

        // Initial deposit validation
        do {
            System.out.print("Enter Initial Deposit Amount: ");
            balance = sc.nextDouble();

            if (balance <= 0) {
                System.out.println("Initial deposit must be greater than Rs. 0");
            }

        } while (balance <= 0);

        System.out.println("\nAccount created successfully!");

        int choice;

        // Main Menu
        do {
            System.out.println("\n========== STUDENT BANK SYSTEM ==========");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                // 1. Deposit Money
                case 1:
                    double deposit;

                    System.out.print("Enter deposit amount: ");
                    deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance = balance + deposit;

                        System.out.println("Deposit successful!");
                        System.out.println("Deposited Amount: Rs. " + deposit);
                        System.out.println("Current Balance: Rs. " + balance);
                    } else {
                        System.out.println("Deposit amount must be greater than Rs. 0");
                    }
                    break;

                // 2. Withdraw Money
                case 2:
                    double withdraw;

                    System.out.print("Enter withdrawal amount: ");
                    withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Withdrawal amount must be greater than Rs. 0");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance = balance - withdraw;

                        System.out.println("Withdrawal successful!");
                        System.out.println("Withdrawn Amount: Rs. " + withdraw);
                        System.out.println("Current Balance: Rs. " + balance);
                    }
                    break;

                // 3. Check Balance
                case 3:
                    System.out.println("Current Balance: Rs. " + balance);
                    break;

                // 4. Display Account Details
                case 4:
                    System.out.println("\n========== ACCOUNT DETAILS ==========");
                    System.out.println("Student Name  : " + studentName);
                    System.out.println("Student ID    : " + studentId);
                    System.out.println("Account Number: " + accountNumber);
                    System.out.println("Balance       : Rs. " + balance);
                    break;

                // 5. Calculate Interest
                case 5:
                    int years;

                    System.out.print("Enter number of years: ");
                    years = sc.nextInt();

                    if (years <= 0) {
                        System.out.println("Number of years must be greater than 0.");
                    } else {

                        // Simple Interest
                        double rate = 5;
                        double interest = (balance * rate * years) / 100;

                        balance = balance + interest;

                        System.out.println("Interest Rate: 5%");
                        System.out.println("Interest Earned: Rs. " + interest);
                        System.out.println("New Balance: Rs. " + balance);
                    }
                    break;

                // 6. Exit
                case 6:
                    System.out.println("Thank you for using Student Bank System!");
                    break;

                // Invalid Choice
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }

        } while (choice != 6);

        sc.close();
    }
}