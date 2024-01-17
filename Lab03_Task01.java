package CSCI1228;

import java.util.Scanner;
/**
 *CSCI1228
 * @author Yacklin Huang (A00475433)
 */

public class Lab03_Task01 {
    public static void main(String[] args) {
        //Declare a variable to store the user's input
        Integer input;
        //Create a new Scanner object to read user input
        Scanner sc=new Scanner(System.in);
        //Create a loop to prompt the user for input
        while (true){
            //Prompt the user to enter a four-digit integer
            System.out.println("Enter a four-digit integer: ");
            //Store the user's input in the variable
            input = sc.nextInt();
            //Check if the length of the input is equal to 4
            if (input.toString().length() == 4){
                //If the length is 4, break out of the loop
                break;
            }else {}
        }
        //Print the reversed version of the input
        System.out.println("The digits in the reverse order are: " + new StringBuilder(input.toString()).reverse());
    }
}
