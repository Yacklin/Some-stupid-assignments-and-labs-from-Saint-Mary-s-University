import java.util.Random;
import java.util.Scanner;
/**
 * A program to simulate rolling dice.
 *
 * @author Mark Young (A00000000) and Yilin Huang(A00475433)
 */
public class DoDice {
    public static final Scanner KBD = new Scanner(System.in);
    public static final Random RAND = new Random();

    public static void main(String[] args) {
        // create variables
        int d1, d2, sum;
        int dice, sides;

        // Introduce yourself
        System.out.println("\n\n"
                + "I'm just rollin' some dice!\n\n");
        System.out.println();
        System.out.print("Press Enter...");
        KBD.nextLine();
        System.out.println();

        // roll dice
        d1 = 1 + rollD6();      // Activity #1
        d2 = 1 + rollD6();      // Activity #1
        sum = d1 + d2;

        // report the result
        System.out.println("I got a " + d1 + " and a " + d2 + ".\n"
                + "The total is " + sum + ".");
        if (d1 == d2) {
            System.out.println("I got doubles!");
        }
        System.out.println();
        System.out.print("Press Enter...");
        KBD.nextLine();
        System.out.println();

        // Activity #2
        System.out.println("\n\n"
                + "I'm just rollin' some multi-sided dice!\n\n");
        d1 = rollD(10);     // Activity #2
        d2 = rollD(100);     // Activity #2
        System.out.println("I got a " + d1 + " on the d10"
                + " and a " + d2 + " on the d100.\n");
        System.out.print("Press Enter...");
        KBD.nextLine();
        System.out.println();

        // Activity #3
        System.out.println("\n\n"
                + "You choose some dice for me to roll.\n\n");
        System.out.print("How many dice should I roll? ");
        dice = KBD.nextInt();
        KBD.nextLine();
        System.out.print("And how many sides should each die have? ");
        sides = KBD.nextInt();
        KBD.nextLine();

        // roll them
        sum = rollMany(dice, sides);        // Activity #3
        System.out.println("I got a total of " + sum + " on those "
                + dice + "d" + sides + ".\n");
        System.out.print("Press Enter...");
        KBD.nextLine();
        System.out.println();
    }

    // Activity #1
    /**
     * A method to roll a 6-sided die.
     *
     * @return a random integer in the range 1 to 6 inclusive.
     */
    public static int rollD6() {
        return RAND.nextInt(6);
    }


    // Activity #2
    /**
     * A method to roll a multi-sided die.
     *
     * @param numSides  the number of sides on the die.
     * @return a random integer in the range 1 to numSides inclusive.
     */
    public static int rollD(int numSides){
        return RAND.nextInt(numSides)+1;
    }

    // Activity #3
    /**
     * A method to roll multiple dice of a given size.
     *
     * @param numDice   the number of dice to roll.
     * @param numSides  the number of sides on each die.
     * @return the sum of numDice random numbers in the range 1 to numSides.
     */
    public static int rollMany(int numDice, int numSides) {
        int sum = 0;
        for (int i = 0; i < numDice; i++) {
            sum += RAND.nextInt(numSides)+1;
        }
        return sum;
    }
}
