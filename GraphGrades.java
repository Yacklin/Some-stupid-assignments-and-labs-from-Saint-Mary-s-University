import java.util.Scanner;

/**
 *This program prints a bar graph showing the distribution of grades in a class.
 *
 * @author Yilin Huang (A00475433)
 */
public class GraphGrades {
    public static void main(String[] args) {
        // use StringBuilder to record the number of grades qualified in a certain counter
        //greater than or equals to 80
        StringBuilder Counter80Plus = new StringBuilder();
        //greater than 70 and lower than 79
        StringBuilder Counter70To79 = new StringBuilder();
        //greater than 60 and lower than 69
        StringBuilder Counter60To69 = new StringBuilder();
        //greater than 0 and lower than 59
        StringBuilder Counter0To59 = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        //introduction
        System.out.print("Grade Distribution\n" +
                "------------------\n" +
                "\n" +
                "This program prints a bar graph showing the distribution of grades in a class.\n" +
                "\n" +
                "By Yilin Huang (A00475433)\n" +
                "\n" +
                "...press enter...\n" +
                "\n" +
                "Enter the grades below, ending with a negative number:");
        while (true){
            //define the container of grade to receive value from user
            //and in the next loop this variable will be initialized by user once again
            int grade = sc.nextInt();
            if (grade < 0){
                System.out.println("...press enter...\n\nDistribution\n");
                System.out.println("80+   |"+Counter80Plus);
                System.out.println("70-79 |"+Counter70To79);
                System.out.println("60-69 |"+Counter60To69);
                System.out.println(" 0-59 |"+Counter0To59);
                System.out.println("\n...press enter...");
                break;
            } else if (grade >= 0 && grade <= 59){
                // 0-59
                Counter0To59.append("*");

            } else if (grade >= 60 && grade <= 69) {
                // 60-69
                Counter60To69.append("*");

            }else if (grade >= 70 && grade <= 79) {
                // 70-79
                Counter70To79.append("*");

            } else if (grade >= 80) {
                // 80+
                Counter80Plus.append("*");
            }

        }
    }
}
