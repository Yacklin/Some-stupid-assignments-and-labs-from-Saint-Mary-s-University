package CSCI1228;
import java.util.Scanner;
public class Lab7 {
     public static void main(String[] args) {
         // create an array of doubles with 10 elements
         double[] arr = new double[10];
         // create a Scanner object to read input from the user
         Scanner sc = new Scanner(System.in);
         // prompt the user to enter 10 numbers
         System.out.println("please enter 10 numbers");
         // loop to read in the 10 numbers
         for (int i = 0; i < arr.length; i++) {
             // read in the next double value from the user
             arr[i] = sc.nextDouble();
         }
         // print out the mean of the array
         System.out.println("The mean is "+mean(arr));
         // print out the standard deviation of the array
         System.out.println("The deviation is "+deviation(arr));
     }
     // function to calculate the standard deviation of the array
     public static double deviation(double[] arr){
         // calculate the mean of the array
         double mean = mean(arr);
         // initialize the sum to 0
         double sum=0;
         // loop to calculate the sum of the squares of each element minus the mean
         for (int i = 0; i < arr.length; i++) {
             sum+=(arr[i]-mean)*(arr[i]-mean);
         }
         // return the sum divided by the length of the array minus 1
         return Math.sqrt(sum/(arr.length-1));
     }
     public static double mean(double[] arr){
         // initialize the sum to 0
         double sum=0;
         // loop to add each element of the array to the sum
         for (double v : arr) {
             sum += v;
         }
         // return the sum divided by the length of the array
         return sum/arr.length;
     }
     // function to calculate the standard deviation of the array
}


