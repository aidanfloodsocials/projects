import java.util.Scanner;
import java.util.InputMismatchException;


public class RhymeBank1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        int size = 0;
        double[] accountBalances = new double[250];
        String[] accountNames = new String[250];

        // Start an infinite loop for the bank admin menu
        for (; true; ) {
            System.out.println("Bank Admin Menu: ");
            System.out.println("Please enter a menu option: ");
            System.out.println("(1): Add a customer to the bank");
            System.out.println("(2): Change customer name");
            System.out.println("(3): Check account balance");
            System.out.println("(4): Modify account balance");
            System.out.println("(5): Summary of all accounts");
            System.out.println("(-1): Quit");

            // Read user input for menu choice
            userInput = input.nextInt();

            if (userInput == 1) {
                // Option 1: Add a customer to the bank
                System.out.println("Bank Add Customer: ");
                System.out.println("Please enter an account balance");
                double balance = input.nextDouble();
                accountBalances[size] = balance;
                System.out.println("Please enter the account name");
                input.nextLine();
                String name = input.nextLine();
                accountNames[size] = name;
                System.out.println("Customer ID is: " + size);
                size = size + 1;
            } else if (userInput == 2) {
                // Option 2: Change customer name
                System.out.println("Bank Change Name Menu: ");
                System.out.println("Please Enter a customer ID to change their name: ");
                int index = input.nextInt();
                System.out.println("What is the customer's new name?");
                input.nextLine();
                accountNames[index] = input.nextLine();
            } else if (userInput == 3) {
                // Option 3: Check account balance
                System.out.println("Bank Check Balance Menu");
                System.out.println("Please Enter a customer ID to check the balance: ");
                int index = input.nextInt();
                double balance = accountBalances[index];
                System.out.println("This customer has $" + balance + " in their account");
            } else if (userInput == 4) {
                // Option 4: Modify account balance
                System.out.println("Bank Modify Balance Menu");
                System.out.println("Please Enter a customer ID to modify the balance: ");
                int index = input.nextInt();
                System.out.println("Please input your new balance: ");
                accountBalances[index] = input.nextDouble();
            } else if (userInput == 5) {
                // Option 5: Summary of all accounts
                System.out.println("Bank All Customer Summary Menu: ");
                double total = 0;
                for (int i = 0; i < size; i++) {
                    total = total + accountBalances[i];
                    System.out.println(accountNames[i] + " has $ " + accountBalances[i] + " in their account");
                }
                System.out.println("In total, there is $" + total + " in the bank");
            } else if (userInput == -1) {
                // Option -1: Quit
                System.exit(-1);
            } else {
                // Invalid input
                System.out.println("ERROR: Invalid input");
            }
        }
    }
}
