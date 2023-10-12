import java.util.Random;
import java.util.Scanner;
/**
 * some activities in the lab
 *
 * @author Yilin Huang (A00475433) and Mark Young
 */
public class L05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //activity 1
        System.out.println("Activity 1:");
        //TODO Activity 1
        printIntro();

        //activity 2
        System.out.println();
        System.out.println("Activity 2:");
        //TODO Activity 2
        feedPet("cat","tuna");
        feedPet("dog","bones");
        feedPet("fish","flakes");

        //activity 3
        System.out.println();
        System.out.println("Activity 3:");
        //TODO Activity 3
        dressPet("Max","pirate");
        dressPet("Felix","spider man");

        int Xcoord;
        //activity 4
        System.out.println();
        System.out.println("Activity 4 \uD83D\uDC31:");
        //TODO Activity 4

        Xcoord = sc.nextInt();
        drawCatFace(Xcoord);
        Xcoord = sc.nextInt();
        drawCatFace(Xcoord);

        //activity 5
        int shots;
        System.out.println();
        System.out.println("Activity 5:\nNumber of laser shots: ");
        //TODO Activity 5
        shots = sc.nextInt();
        playLaser(shots);
    }
    /**
     * Prints a welcome message for the "Pet Playtime" program. The message
     * introduces the program and its author
     */
    public static void printIntro() {
        System.out.println("Welcome to the 'Pet Playtime' program by "
                + "Yilin Huang");
    }
    /**
     * Feeds a specified pet with the provided food: prints a message like
     * Feeding the cat some tuna!
     *  pet The type or name of the pet to be fed.
     *  food The type of food to give to the pet.
     */
    public static void feedPet(String pet, String food) {
        System.out.println("Feeding the " + pet + " some " + food + "!");
    }
    /**
     * Describes how a pet looks when dressed in a specified outfit.
     *
     *  petName The name or type of the pet being dressed.
     *  outfit The type of outfit the pet is wearing.
     */
    public static void dressPet(String petName, String outfit) {
        System.out.println(petName+" looks funny in their "+outfit+" costume!");
    }
    //This method creates a random number of cat faces and prints them out
public static void playLaser(int times){
        //Create a new random object
        Random random = new Random();
        //Loop through the number of times specified
        for (int i = 0; i < times; i++) {
            //Call the drawCatFace method with a random number
            drawCatFace(random.nextInt(10));
        }
    }
    //This method prints out a cat face with a random number of spaces before it
    public static void drawCatFace(int xCoordinate){
        //Create a string builder to store the spaces
        StringBuilder sb = new StringBuilder();
        //Prompt the user for the x coordinate
        System.out.println("please enter x-coordinate");
        //Loop through the number of spaces specified
        for (int i = 0; i < xCoordinate; i++) {
            //Append a space to the string builder
            sb.append(" ");
        }
        //Print out the cat face with the spaces
        System.out.println(sb + "\uD83D\uDC31");
    }
}
