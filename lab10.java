package CSCI1228;

import java.util.Scanner;

public class lab10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter=0;
        String[][] arr = {{"Alberta","Edmonton"},{"British Columbia","Victoria"},
                {"Manitoba","Winnipeg"},{"Newfoundland and Labrador","St. John's"},
                {"Northwest Territories","Yellowknife"},{"Nova Scotia","Halifax"},
                {"Nunavut","Iqaluit"},{"Ontario","Toronto"},
                {"Prince Edward Island","Charlottetown"},{"Quebec","Quebec City"},
                {"Saskatchewan","Regina"},{"Yukon","Whitehorse"}};
        for (String[] subarr:arr) {
            System.out.println("what is the capital of "+subarr[0]+"? ");
            if (scanner.nextLine().equals(subarr[1])){
                counter++;
                System.out.println("correct!");
            }else {
                System.out.println("correct one should be "+subarr[1]+"!");
            }
        }
        System.out.println("you got "+counter+" correct!");

    }
}
