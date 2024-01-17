package CSCI1228;

import java.util.Scanner;
/**
 *CSCI1228
 * @author Yacklin Huang (A00475433)
 */

public class Question2_A1 {
    public static void main(String[] args) {
        //Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        //Declare a Double variable to store the user input
        Double weight;
        //Prompt the user to enter the weight of the package
        System.out.println("Enter the weight of package: ");
        //Store the user input in the weight variable
        weight= sc.nextDouble();
        //Loop until the user input is valid
        while (true){
            //Check if the user input is valid
            if(weight<=0){
                //Print an error message if the user input is invalid
                System.out.println("Invalid input");
                //Prompt the user to enter the weight of the package again
                System.out.println("Enter the weight of package: ");
                //Store the user input in the weight variable
                weight= sc.nextDouble();
            }else break;
        }
        //Check the weight of the package and calculate the shipping cost
        if (0<weight && weight<=1){
            System.out.println("The shipping cost is $3.5");
        }else if(1<weight && weight<=3){
            System.out.println("The shipping cost is $5.5");
        }else if(3<weight && weight<=10){
            System.out.println("The shipping cost is $8.5");
        }else if(10<weight&&weight<=20){
            System.out.println("The shipping cost is $10.5");
        }else{
            System.out.println("this package cannot be shipped");
        }
    }
}
