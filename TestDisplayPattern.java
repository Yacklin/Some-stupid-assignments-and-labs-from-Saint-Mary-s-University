package CSCI1228;

import java.util.Scanner;
/**
 *CSCI1228
 * @author Yacklin Huang (A00475433)
 */

//This class is used to test the display pattern
public class TestDisplayPattern {
    public static void main(String[] args) {
        //Create a new Scanner object to get user input
        Scanner sc = new Scanner(System.in);
        int n;
        //Loop until the user enters a valid number
        while (true) {
            System.out.println("please enter number of line:");
            n = sc.nextInt();
            //If the number is less than or equal to 0, do nothing
            if (n <= 0) {
            } else break;
        }
        //Call the displayPattern method with the user input
        displayPattern(n);
    }
    //This method is used to display the pattern
    public static void displayPattern(int n) {
        //Create a StringBuilder object to store the pattern
        StringBuilder container= new StringBuilder();
        //Create a boolean flag to check if the pattern should be displayed
        boolean flag = true;
        //Loop through the number of lines
        for (int i = 1; i <= n; i++) {
            //Loop through the number of columns
            for (int j = i; j >= 1; j--) {
                //Loop through the number of spaces
                while (flag){
                    for (int k = 0; k < n-i; k++) {
                        //Append the number of spaces
                        container.append("  ");
                    }
                    //Set the flag to false
                    flag=false;
                }
                //Append the number
                container.append(" ").append(j);
            }
            //Print the pattern
            System.out.println(container);
            //Set the flag to true
            flag=true;
            //Reset the container
            container=new StringBuilder();
        }
    }
}
