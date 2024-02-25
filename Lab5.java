package CSCI1228;

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        //Create a new Scanner object
        Scanner sc = new Scanner(System.in);
        //Prompt the user to enter a double
        System.out.println("Enter a double: ");
        //Store the user input in a double
        double input = sc.nextDouble();
        //Print the number of digits before the decimal point
        System.out.println("the number of digits before decimal point is: "+String.valueOf((int)input).length());
    }
}