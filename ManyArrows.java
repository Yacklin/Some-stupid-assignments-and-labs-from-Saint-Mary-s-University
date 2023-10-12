import java.util.Scanner;

/**
 * a program to ask user how long the arrow they want to draw
 * and stop until negative number is entered.
 * @author Yilin Huang (A00475433)
 */
public class ManyArrows {
    public static void main(String[] args) {
        // create variable to receive the length of the arrows from user
        int lenArrows;
        Scanner sc = new Scanner(System.in);
//use the while loop to keep asking length from user until it is negative
        while (true) {
            //build a stringbuilder to connect shortline together
            // define the stringbuilder inside the while block
            // so in the next loop the sb is "empty"
            StringBuilder sb = new StringBuilder();
            // ask user
            System.out.println("Enter a length: ");
            lenArrows = sc.nextInt();

            for (int i = 0; i < lenArrows; i++) {
                //use append method to connect shortline together
                sb.append("-");
            }
            if (lenArrows>=0){
                System.out.println("<"+sb+">");
            }else {
                // if the length is negative, break the while loop
                break;
            }



        }
    }
}
