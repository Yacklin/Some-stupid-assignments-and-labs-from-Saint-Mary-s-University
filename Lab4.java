package CSCI1228;
import java.util.Scanner;
/**
 *CSCI1228
 * @author Yacklin Huang (A00475433)
 */

public class Lab4 {
    public static void main(String[] args) {
        //Create a new Scanner object to read user input
        Scanner  input = new Scanner(System.in);
        //Declare two variables to store the numerator and denominator
        int numerator;
        int denominator;
        //Prompt the user to enter the numerator
        System.out.println("please enter the numerator: ");
        numerator = input.nextInt();
        //Prompt the user to enter the denominator
        System.out.println("please enter the denominator: ");
        denominator = input.nextInt();
        //Loop until the denominator is not 0
        while (true) {
            if (denominator == 0) {
                //Prompt the user to enter the denominator
                System.out.println("please enter the denominator: ");
                denominator = input.nextInt();
            } else break;
        }
        //Check if the numerator is greater than or equal to the denominator
        if (numerator>=denominator){
            //Check if the numerator is divisible by the denominator
            if(numerator%denominator==0){
                //Print the reduced fraction
                System.out.println("the fraction is improper and can be reduced to:"+numerator/denominator);
            }else {
                //Print the mixed fraction
                System.out.println("the fraction is improper and its mixed fraction is:"+(numerator/denominator)+"+"+(numerator%denominator)+
                        "/"+denominator);
            }
        }else{
            //Print the proper fraction
            System.out.println("the fraction is proper:"+numerator+"/"+denominator);
        }
    }
}
