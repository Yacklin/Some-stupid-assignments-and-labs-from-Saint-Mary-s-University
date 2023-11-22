/**
 * as the requirements of lab11 suggests, the name this file should be ChuresAndLadders
 *
 * @author Yilin Huang (A00475433)
 */
import java.util.Random;
public class ChutesAndLadders {
    // class constants (any program only needs one of each of these)
    private static final Random RAND = new Random();
    private static final int NUM_SPACES = 10;
    private static final int DIE_SIDES = 6;
    private static final int PLAYERS=3;
    public static void main(String[] args) {
        boolean flag = true;
        // create an array to store player's position respectively
        int[] playersPositions=new int[PLAYERS];
        // create required variables
        int[] board;
        int winner = -1; // -1 == no winner yet
        // set up the game
        board = makeBoard();
        // keep rolling until someone wins
        while (flag) {
            for (int i = 0; i < playersPositions.length; i++) {
                int roll = rollDie();
                playersPositions[i] += roll;
                System.out.println("Player " + i + " rolls " + roll);
                if(playersPositions[i]<NUM_SPACES){
                    System.out.println("Player "+i+" reaches " + playersPositions[i]);
                }else {
                    System.out.println("Player "+i+" reaches 10");
                    playersPositions[i]=10;
                    break;
                }
                if (board[playersPositions[i]] < playersPositions[i]) {
                    playersPositions[i] = board[playersPositions[i]];
                    System.out.println("Player "+i+" slides down a chute to "
                            + playersPositions[i]);
                } else if(board[playersPositions[i]] > playersPositions[i]){
                    playersPositions[i] = board[playersPositions[i]];
                    System.out.println("Player "+i+" climbs up a ladder to "
                            + playersPositions[i]);
                }
            }
            for (int i = 0; i < playersPositions.length; i++) {
                if (playersPositions[i] >= NUM_SPACES) {
                    winner = i;
                    flag=false;
                }
            }
        }
        System.out.println("Player " + winner + " wins!");
    }
    private static int rollDie() {
        return RAND.nextInt(DIE_SIDES) + 1;
    }
    //the function of makeboard is to control the ladders and chutes of the game
    private static int[] makeBoard() {
        int[] board = new int[NUM_SPACES + DIE_SIDES];
        for (int i = 0; i < board.length; i++) {
            board[i] = i;
        }
        board[9]=6;
        board[3]=7;
        return board;
    }
}
