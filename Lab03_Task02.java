package CSCI1228;

import java.util.Scanner;
/**
 *CSCI1228
 * @author Yacklin Huang (A00475433)
 */

//This is a class called Lab03_Task02
public class Lab03_Task02 {
    //This is the main method
    public static void main(String[] args) {
        //This creates a new Scanner object
        Scanner scanner=new  Scanner(System.in);
        //This creates three variables to store the three edges of the triangle
        double edge1;
        double edge2;
        double edge3;
        //This loop will run until the user inputs three valid edges
        while (true){
            //This prints a prompt to the user
            System.out.println("please enter the three edges of the triangle:");
            //This stores the first edge in the variable
            edge1= scanner.nextDouble();
            //This stores the second edge in the variable
            edge2= scanner.nextDouble();
            //This stores the third edge in the variable
            edge3= scanner.nextDouble();
            //This checks if the three edges form a triangle
            if (edge1+edge2<=edge3||edge1+edge3<=edge2||edge2+edge3<=edge1||edge1<=0||edge2<=0||edge3<=0){
                //This prints an error message if the three edges do not form a triangle
                System.out.println("The three edges do not form a triangle. Please re-enter:");
            }else System.out.println("the perimeter of this triangle is "+(edge1+edge2+edge3));
        }
    }
}
