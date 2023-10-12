import java.util.Scanner;
/**
 * A calculator to Calculate user's current age and age of retirement and say hi to grandparents
 *
 * @author Yilin Huang (A00475433)
 */
public class YearCalculator {
    public static void main(String[] args) {
        //create variable to accept input
        Scanner sc = new Scanner(System.in);

        // set up elementary data
        int current_year = 2023;
        int age_of_retirement = 65;
        double generation_gap = 27.5;
        int Born_year;

        System.out.println("Year Calculator"+
                "\n" +
                "---------------\n" +
                "\n" +
                "This program to Calculate user's current " +
                "age and age of retirement and say hi to grandparents\n" +
                "your family.\n" +
                "\n" +
                "By Yilin Huang (A00475433)\n"+"\n"+"press enter..."+"\n");

        //ask the user's name
        System.out.println("what is your name?");
        String name = sc.nextLine();

        // ask user when were you born
        while (true){
            System.out.println("what year were you born?");
            Born_year = sc.nextInt();
            if (Born_year <= 0){
                System.out.println();
            }
            else{
                break;
            }
        }
        // say hi to user
        System.out.println("Hi,"+name+"!"+"\n"+"\n");
        System.out.println("Since you were born in "+Born_year+
                ","+"you turn "+(current_year - Born_year)+" this year.");

        //print out the information about retirement and user's parent, grandparent
        System.out.println("you will retire about "+
                (Born_year + age_of_retirement)+"."+"\n"+"\n"
                +"Did you know that the average generation is about 27.5 years?\n" +
                "That means that your parents were probably born about "
                +(Math.round(Born_year - generation_gap)-1)+",\n" +
                "and your grandparents about "+(int)(Born_year - 2*generation_gap)+".");
        System.out.println("Say \"Hi\" to your grandparents from me the next time you see them!");

    }
}
