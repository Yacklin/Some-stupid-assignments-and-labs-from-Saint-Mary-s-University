package CSCI1228;

import java.util.Scanner;
/**
 *CSCI1228
 * @author Yacklin Huang (A00475433)
 */

//This class is used to find the number of uppercase letters in a given string
public class Question4_A1 {
    public static void main(String[] args) {
        //Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        //Prompt the user to enter a string
        System.out.println("please enter a string");
        //Read the user input
        String str = sc.nextLine();
        //Initialize a counter to keep track of the number of uppercase letters
        int counter=0;
        //Loop through the string
        for (int i = 0; i < str.length(); i++) {
            //Check if the character is a letter
            if (Character.isLetter(str.charAt(i))){
                //Check if the letter is uppercase
                if (Character.isUpperCase(str.charAt(i))){
                    //Increment the counter if the letter is uppercase
                    counter++;
                }
            }
        }
        //Print the number of uppercase letters
        System.out.println("Number of uppercase letters: " + counter);
    }
}