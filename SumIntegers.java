import java.util.Scanner;

/**
 * this program is to sum up all the integers at the range given
 *
 * @author Yilin Huang (A00475433) and Mark Young (A00000000)
 */
public class SumIntegers {
    //public static final int MAX = 100;

    public static void main(String[] args) {
        // create required variables
        int sum = 0;
        int maxnumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to sum up To: ");
        maxnumber = sc.nextInt();

        // print sum of numbers from 1 to given number from user

        System.out.print("I'm adding up the numbers: ");
        //Loop through the numbers from 1 to maxnumber
        for (int i = 1; i <= maxnumber; ++i) {
            //Print the current number
            System.out.print(i + " ");
            //Add the current number to the sum
            sum += i;
        }
        //Print a new line and the sum of the numbers
        System.out.println(".\n"
                + "The sum of the integers from 1 to " + maxnumber
                + " is " + sum);
    }
}
