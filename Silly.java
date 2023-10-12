import java.util.Scanner;
/**
 * this is a silly program, literally i mean
 *
 * @author Yilin Huang (A00475433)
 */
public class Silly {
    public static void main(String[] args) {
        //create necessary variables
        Scanner sc = new Scanner(System.in);
        int inputEntered;
        //introduction
        System.out.println("This is just a silly program.\n" +
                "By Mark Young (A00000000) and Yilin Huang (A00475433)\n");
        System.out.println("Enter a positive number");
        inputEntered = sc.nextInt();
        if(inputEntered > 0){
            if(inputEntered % 2 == 0){
                System.out.println(inputEntered + " is even");
                for (int i = 1; i <= (inputEntered/2); i++) {
                    System.out.print(i+" ");
                }
            }else {
                System.out.println(inputEntered+" is odd\ni will print a triangle of height "+inputEntered);
                //call the function defined
                printTriangle(inputEntered);
            }
        }else {
            System.exit(0);
        }
        while (true){
            //Prompt user to enter another positive integer
            System.out.println("\nEnter another positive integer: ");
            inputEntered = sc.nextInt();
            //Check if the user entered a positive integer
            if(inputEntered > 0){
                //Check if the number is even or odd
                if(inputEntered % 2 == 0){
                    System.out.println(inputEntered + " is even");
                    //Print the even numbers
                    for (int i = 1; i <= (inputEntered/2); i++) {
                        System.out.print(i+" ");
                    }
                }else {
                    System.out.println(inputEntered+" is odd\ni will print a triangle of height "+inputEntered);
                    //Call the printTriangle method to print the odd numbers
                    printTriangle(inputEntered);
                }
            }else {
                //If the user entered a negative number, break out of the loop
                break;
            }
        }
    }
    public static void printTriangle(int num){
        // a function to draw triangle
        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
