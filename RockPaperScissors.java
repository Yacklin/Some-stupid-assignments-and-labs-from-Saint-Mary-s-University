import java.util.Random;
import java.util.Scanner;
/**
 * a program of game called Rock, Paper, Scissors
 *
 * @author Yilin Huang (A00475433)
 */
//The program prints out the number of games played, the number of wins, losses, and ties.
public class RockPaperScissors {
    //Create a new Random object
    public static final Random r = new Random();
    //Create a new Scanner object
    public static final Scanner sc = new Scanner(System.in);
    //Create a String to store the user's choice
    public static String choice;
    //Create a counter to keep track of the number of games played
    public static int GameCounter = 0;
    //Create a counter to keep track of the number of wins
    public static int WinCounter = 0;
    //Create a counter to keep track of the number of losses
    public static int LossCounter = 0;
    //Create a counter to keep track of the number of ties
    public static int TieCounter = 0;
    //Create the main method
    public static void main(String[] args) {
        //Create a String to store the computer's choice
        String choiceFromComputer;
        //Print out a welcome message
        System.out.println("Rock, Paper, Scissors Game\n" +
                "--------------------------\n" +
                "\n" +
                "This program plays Rock, Paper, Scissors with the user\n" +
                "until they enter the EXIT command.\n" +
                "\n" +
                "Author: Nikita Neveditsin and Mark Young and Yilin Huang");
        //Loop until the user enters the EXIT command
        while (true) {
            //Prompt the user to enter their choice
            choice = getChoiceFromUser();
            //Check if the user entered the EXIT command
            if (choice.equals("Exit")) {
                //Print out the number of games played and the user's record
                System.out.println("You played "+GameCounter+
                        " Games, and your record is\n");
                printStats(WinCounter,LossCounter,TieCounter);
                //Print out a goodbye message
                System.out.println("Goodbye!");
                //Break out of the loop
                break;
            /*Check if the user entered a valid choice*/
            } else if (choice.equals("Rock")||choice.equals("Paper")||choice.equals("Scissors")) {
                //Create a String to store the computer's choice
                choiceFromComputer = getRandomChoice();
                //Print out the computer's choice
                System.out.println("Computer chose: "+choiceFromComputer);
                //Print out the result of the game
                System.out.println(determineWinner(choice,choiceFromComputer));
                //Increment the number of games played
                GameCounter += 1;
            /*If the user entered an invalid choice, prompt them to try again*/
            }else {
                continue;
            }
            /*Print out the number of games played and the user's record every 5 games*/
            if (GameCounter % 5 == 0){
                System.out.println("After "+GameCounter+" Games:");
                printStats(WinCounter,LossCounter,TieCounter);
            }
        }
    }
    /*Prompt the user to enter their choice*/
    public static String getChoiceFromUser(){
        //Prompt the user to enter their choice
        System.out.println("Enter your choice (Rock/Paper/Scissors or type Exit to end the game): ");
        //Store the user's choice
        String choice01 = sc.nextLine();
        //Return the user's choice
        return choice01;
    }
    /*Create a String to store the computer's choice*/
    public static String getRandomChoice(){
        String choiceOfComputer = new String();
        //Generate a random number between 1 and 3
        int randomNumber = r.nextInt(3)+1;
        //Check the random number and assign the corresponding choice to the computer
        if (randomNumber == 1){
            choiceOfComputer  = "Rock";
        }else if (randomNumber == 2){
            choiceOfComputer  = "Paper";
        }else{
            choiceOfComputer = "Scissors";
        }
        /*Return the computer's choice*/
        return choiceOfComputer;
    }
    /*Determine the winner of the game*/
    public static String determineWinner(String playerChoice, String computerChoice){
        String result = new String();
        //Check if the game is a tie
        if (playerChoice.equals(computerChoice)){
            result = "There is a Tie";
            TieCounter += 1;
        //Check if the player wins
        } else if (playerChoice.equals("Rock")&&computerChoice.equals("Paper")){
            result ="You Lose";
            LossCounter += 1;
        } else if (playerChoice.equals("Paper")&&computerChoice.equals("Scissors")) {
            result = "You Lose";
            LossCounter += 1;
        } else if (playerChoice.equals("Scissors")&&computerChoice.equals("Rock")) {
            result = "You Lose";
            LossCounter += 1;
        } else if (playerChoice.equals("Rock")&&computerChoice.equals("Scissors")) {
            result = "You Win";
            WinCounter += 1;
        } else if (playerChoice.equals("Paper") && computerChoice.equals("Rock")) {
            result = "You Win";
            WinCounter += 1;
        }else if (playerChoice.equals("Scissors") && computerChoice.equals("Paper")) {
            result = "You Win";
            WinCounter += 1;
        }
        /*Return the result of the game*/
        return result;
    }
    //Print out the number of wins, losses, and ties
    public static void printStats(int wins, int losses, int ties){
        System.out.println("\n" +
                " Wins: "+wins+"\n" +
                " Losses: "+losses+"\n" +
                " Ties: "+ties+"\n");
    }
}
