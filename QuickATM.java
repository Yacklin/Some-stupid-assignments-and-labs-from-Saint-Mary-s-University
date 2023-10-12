import java.util.Scanner;
/**
 * a program to demonstrate the use of the QuickATM class.
 *
 * @author Yilin Huang (A00475433)
 */

public class QuickATM {
    public static void main(String[] args) {
        //Brief introduction

        System.out.println("Welcome to the SimpleATM by N. Neveditsin!\n" +
                "\n" +
                "Choose an option:\n" +
                " PIN (Enter PIN)\n" +
                " BAL (View Balance)\n" +
                " WD (Withdraw)\n" +
                " DEP (Deposit)\n" +
                " CP (Change PIN)\n" +
                " Exit\n" +
                "\n" +
                "Your choice: ");
        // variables preparation
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        String pin = "0923";
        int balance = 5000;
        String newPinContainer;
        // to receive the input amount from user when WD and DP
        int amount;
        //to receive entered pin from user
        String userInputPin;
        String choice2;

        if(choice.equals("PIN")){
            System.out.println("Please enter your PIN: ");
            userInputPin = sc.nextLine();
            if (userInputPin.equals(pin)) {
                System.out.println("Authenticated Successfully.");
                System.out.println("Choose an option:\n" +
                        " BAL (View Balance)\n" +
                        " WD (Withdraw)\n" +
                        " DEP (Deposit)\n" +
                        " CP (Change PIN)\n" +
                        " Exit\n" +
                        "\n" +
                        "Your choice: ");
                choice2 = sc.nextLine();
                if (choice2.equals("BAL")) {
                    System.out.println("Your balance is: $"+balance);

                }
                if (choice2.equals("WD")) {
                    System.out.println("Enter amount to withdraw: $");
                    amount = sc.nextInt();
                    //judge which amount is bigger than another
                    // and take further action
                    if (amount > balance){
                        System.out.println("Insufficient balance. Exiting...");
                    }
                    else {
                        balance -= amount;
                        System.out.println("Withdrawal successful. " +
                                "New balance: $" + balance);
                    }

                }
                if (choice2.equals("DEP")) {
                    // Request the amount to be deposited
                    System.out.println("Enter amount to deposit: $");
                    // Get the amount to be deposited
                    amount = sc.nextInt();
                    // Update the balance
                    balance += amount;
                    System.out.println("Deposit successful. New balance: $" + balance);
                }
                if (choice2.equals("CP")) {
                    // Request the new PIN
                    System.out.println("Enter your new PIN: ");
                    // Get the new PIN
                    newPinContainer = sc.nextLine();
                    // Check if the new PIN is the same as the old one
                    if (newPinContainer.equals(pin)) {
                        System.out.println("PIN unchanged. New PIN should be " +
                                "different from the old one. Exiting...");
                    }
                    else {
                        // Update the PIN
                        pin = newPinContainer;
                        System.out.println("PIN successfully changed.");
                    }
                }
                if (choice2.equals("Exit")){
                    System.out.println("Exiting...\n");

                }

            }else {
                System.out.println("Incorrect PIN. Exiting...");
            }

        }
        else if(choice.equals("BAL")){
            //check out balance
            System.out.println("Your balance is: $"+balance);

        }
        else if(choice.equals("WD")){
            //unauthenticated operation withdrawing money
            System.out.println("You are not authenticated to perform this operation");

        }
        else if(choice.equals("DEP")){
            //prompt user to enter amount to deposit
            System.out.println("Enter amount to deposit: $");
            //store user input in variable
            amount = sc.nextInt();
            //add the amount to the balance
            balance += amount;
            //print the new balance
            System.out.println("Deposit successful. New balance: $" + balance);

        }
        else if(choice.equals("CP")){
            //prompt user to enter new pin
            //unauthenticated operation in changing pin
            System.out.println("You are not authenticated to perform this operation");

        }
        else if(choice.equals("Exit")){
            System.out.println("Exiting...");

        } else {
            System.out.println("Invalid choice.");
        }
        System.out.println("Thanks for using QuickATM. See you next time!");

    }
}
