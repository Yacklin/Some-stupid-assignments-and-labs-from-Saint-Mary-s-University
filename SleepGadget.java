import java.util.*;
/**
 * description
 *
 * @author Yilin Huang (A00475433)
 */
public class SleepGadget {
    public static void main(String[] args) {
        //Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        //Declare variables to store user input
        int choice;
        int age;
        Integer hours;
        int daycounter=0;
        Integer sum=0;
        ArrayList<Integer> list = new ArrayList<>();
        //Print a welcome message
        System.out.println("  Sleep Gadget\n" +
                "  By Somayeh Kafaie\n" +
                "Welcome to our sleep app!\n" +
                "It will provide you with some fun facts regarding your sleep habits!\n");
        //Loop until user exits
        while (true){
            //Prompt user for a choice
            System.out.println("Here are available choices:\n" +
                    "  1.   Find recommended hours of sleep\n" +
                    "  2.   Calculate sleep statistics\n" +
                    "  0.   Exit\n" +
                    "\n" +
                    "Your choice: ");
            //Store user input
            choice = sc.nextInt();
            //Check if user has chosen to exit
            if (choice == 0){
                System.out.println("Sleep is the best medicine; try to get enough of it!\n" +
                        "Good bye!");
                break;
            //Check if user has chosen to find recommended hours of sleep
            } else if (choice == 1){
                //Prompt user for their age
                System.out.println("How old are you? ");
                age = sc.nextInt();
                /*
                    Age group	Recommended hours of sleep
                    1 year	12-16 hours
                    2 years	11-14 hours
                    3-5 years	10-13 hours
                    6-12 years	9-12 hours
                    13-18 years	8-10 hours
                    19-60 years	At least 7 hours
                    Above 60 years	7-9 hours*/
                //Print the recommended hours of sleep based on the user's age
                if (age == 1){
                    System.out.println("You need to sleep 12-16 hours!");
                } else if (age == 2){
                    System.out.println("You need to sleep 11-14 hours!");
                } else if (3 <= age && age <= 5) {
                    System.out.println("You need to sleep 10-13 hours!");
                } else if (6 <= age && age <= 12) {
                    System.out.println("You need to sleep 9-12 hours!");
                } else if (13 <= age && age <= 18) {
                    System.out.println("You need to sleep 8-10 hours!");
                } else if (19 <= age && age <= 60) {
                    System.out.println("You need to sleep at least 7 hours!");
                } else if (60 < age) {
                    System.out.println("You need to sleep 7-9 hours!");
                }
                //Prompt user to press enter
                System.out.println("\npress enter ... ");
            //Check if user has chosen to calculate sleep statistics
            } else if (choice == 2) {
                //Prompt user to enter the number of hours they have slept in the last few days
                System.out.println("Enter the number of hours you slept in the last few days\n" +
                        "(when you are done enter a negative number):");
                //Loop until user has entered a negative number
                while (true){
                    hours = sc.nextInt();
                    //Check if user has entered a negative number
                    if (hours < 0){
                        //Print the sleep statistics
                        System.out.println("In the last "+ daycounter +
                                " days you have slept "+Math.rint((double)sum/daycounter)+
                                " hours per day" +
                                " on " +
                                "average!\n" +
                                "During this time window, " +
                                "you have slept at most "+Collections.max(list)+
                                " hours and " +
                                "at " +
                                "least " + Collections.min(list)+
                                "hours!");
                        //Prompt user to press enter
                        System.out.println("\npress enter ... \n");
                        break;
                    //Store user input
                    } else {
                        list.add(hours);
                        sum += hours;
                        daycounter++;
                    }
                }
            //Check if user has entered a valid choice
            }else {
                System.out.println("Please enter a valid choice number (0-2)\n");
            }
        }
    }
}
