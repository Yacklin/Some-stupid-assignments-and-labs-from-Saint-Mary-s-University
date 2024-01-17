package CSCI1228;
/**
 *CSCI1228
 * @author Yacklin Huang (A00475433)
 */

import java.util.Scanner;
public class Lab02_Yilin {
    public static void main(String[] args) {
        //Create a Scanner object to read user input
        Scanner sc= new Scanner(System.in);
        //Declare variables to store user input
        Double initialVelocity;
        Double time;
        Double finalVelocity;
        //Prompt the user to enter the initial velocity
        System.out.println("please enterthe initial velocity:");
        initialVelocity= sc.nextDouble();
        //Loop until the user enters a positive time
        while (true){
            //Prompt the user to enter the time in seconds
            System.out.println("please enterthe time in seconds:");
            time= sc.nextDouble();
            //If the time is positive, break out of the loop
            if (time>0){
                break;
            }else {
                //Otherwise, print an error message and re-prompt the user
                System.out.println("the time must be positive, please re-enter:");
            }
        }
        //Prompt the user to enter the final velocity
        System.out.println("please enterthe final velocity:");
        finalVelocity=sc.nextDouble();
        //Calculate and print the acceleration
        System.out.println("the acceleration is "+(finalVelocity-initialVelocity)/time+"m/s^2");
    }
}
