import java.util.Scanner;
/**
 * the program is to calculate how much a customer must pay to see a movie
 *
 * @author Yilin Huang (A00475433)
 */
public class MoviePrices {
    public static void main(String[] args) {
        //create the variables we need
        Scanner sc = new Scanner(System.in);
        int age;
        boolean flag = true;
        //introduce myself
        System.out.println("\nWelcome to the movies. The price of admission" +
                " depends on your age.\n");
        System.out.println("how old are you?");
        age = sc.nextInt();
       double price;
        while (true){
            if (age <= 0) {
                // deal with the situation that age is lower than 0
                //once receive reasonable age from user
                // go back the part of judgement of age
                //use while loop to deal with this
                while (flag){
                    System.out.println("That cannot be right!");
                    System.out.println("how old are you, really?");
                    age = sc.nextInt();
                    if (age <= 0){
                        continue;
                    }else{
                        flag = false;
                    }
                }
                continue;
                // normal standard of charge for reasonable age

            }else if (age >0){
               if (age < 12){
                   System.out.println("Children's price.");
                   price = 2.99;
                   System.out.println("that'll be $"+ price +", please.");
                   break;
               }else if(age >= 12 && age <18){
                   System.out.println("Youth's price.");
                   price = 7.99;
                   System.out.println("that'll be $"+ price +", please.");
                   break;
               }else if(age >= 18 && age <65){
                   System.out.println("Regular price.");
                   price = 8.99;
                   System.out.println("that'll be $"+ price +", please.");
                   break;
               }else{
                   System.out.println("Senior's price.");
                   price = 6.99;
                   System.out.println("that'll be $"+ price +", please.");
                   break;
               }
            }
        }

    }
}
