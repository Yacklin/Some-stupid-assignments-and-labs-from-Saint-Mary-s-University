/**
 * PensionEligibility program
 *
 * @author Yilin Huang (A00475433) and Mark Young (A00000000)
 */
import java.util.Scanner;
public class PensionEligibility {
    public static final String YES = "YES";
    public static final String NO = "NO";

    public static final int NORMAL_AGE = 65;  // normal age of eligibility
    public static final int EARLY_AGE = 50;   // age for early eligibility

    public static void main(String[] args) {
        // create required variables
        Scanner keyboard = new Scanner(System.in);
        int age;
        String resp;
        boolean disability, eligible;

        // introduce yourself
        System.out.print("\n"
                + "This program checks to see "
                + "if you are eligible for a pension.\n"
                + "Please answer the questions truthfully.\n\n");

        // get user's age
        System.out.print("How old are you? ");
        age = keyboard.nextInt();
        keyboard.nextLine();

        // find out whether user has a disability
        System.out.print("Do you have a disability? ");
        resp = keyboard.next().toUpperCase();

        while (!resp.startsWith(YES) && !resp.startsWith(NO)) {
            System.out.print("Please enter yes or no.\n"
                    + "Do you have a disability? ");
            resp = keyboard.next().toUpperCase();
            keyboard.nextLine();
        }
        // resp is now either YES or NO
        System.out.println();

        // determine eligibility
        disability = resp.startsWith(YES);
        eligible = (age >= NORMAL_AGE) || (age >= EARLY_AGE && disability);

        // provide further instructions for user
        if (eligible) {
            System.out.print("You are eligible for this pension.\n"
                    + "Please contact us at http://nuhuh.gov.ca\n\n");
        } else {

            // the response is impolite sharply

            System.out.print("You are not eligible for this pension.\n"
                    + "Please go away.\n\n");
            //System.out.println("i am so sorry. ");
        }
    }
}
