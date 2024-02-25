package CSCI1228;
import java.util.Scanner;
public class Lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a positive integer:");
        int nnnn = sc.nextInt();
        if(isPalindrome(nnnn)){
            System.out.println(nnnn+" is palindrome");
        }else {
            System.out.println(nnnn+"is not palindrome");
        }
    }
    public static boolean isPalindrome(int number){
        return number==reverse_1(number);
    }
    public static int reverse_1(int num){
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        System.out.println(sb.capacity()+" and "+sb.length());
        return Integer.parseInt(sb.reverse().toString());
    }
}



