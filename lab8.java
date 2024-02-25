package CSCI1228;

import java.util.Arrays;

public class lab8 {
    static int outcome;
    public static void main(String[] args) {
        for (int i= 0; i < 3; i++){
            for (int j=0;j<15;j++){
                System.out.printf("%4d",getRandom(1,100,4,8,95,93));
            }
            System.out.println();
        }

    }
    public static int getRandom(int start, int end, int... numbers){
        Arrays.sort(numbers);
        while (true){
            outcome = (int) (Math.random() * (end - start + 1)) + start;
            //check if the outcome is already in the list of numbers
            if(Arrays.binarySearch(numbers,outcome)>=0){
            }else break;
        }
        return outcome;
    }
}
