package CSCI1228;

import java.util.Scanner;
/**
 *CSCI1228
 * @author Yacklin Huang (A00475433)
 */

//Create a main method to run the program
public class Question1_A1 {
    public static void main(String[] args) {
        //Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        //Declare a Double variable to store the user input
        Double feet;
        //Create an infinite loop
        while (true){
            //Prompt the user to enter a value for feet
            System.out.println("please enter a value for feet: ");
            //Store the user input in the Double variable
            feet = sc.nextDouble();
            //Check if the user input is less than 0
            if (feet<0){
                //If it is, do nothing
            }else break;
        }
        //Print the value of feet in meters
        System.out.println(feet+"feet is "+feet*0.305+"meters");
    }
}
