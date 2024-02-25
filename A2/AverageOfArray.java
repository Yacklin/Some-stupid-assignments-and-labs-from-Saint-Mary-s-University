package CSCI1228.A2;

import java.util.Scanner;

public class AverageOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[10];
        System.out.println("please enter ten double values");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }
        System.out.println("The average of the array is " + average(array));
    }
    public static double average(double[] array){
        double sum=0;
        // loop to add each element of the array to the sum
        for (double v : array) {
            sum += v;
        }
        // return the sum divided by the length of the array
        return sum/array.length;
    }
    public static int average(int[] array){
        int sum=0;
        // loop to add each element of the array to the sum
        for (int v : array) {
            sum += v;
        }
        // return the sum divided by the length of the array
        return sum/array.length;
    }
}
