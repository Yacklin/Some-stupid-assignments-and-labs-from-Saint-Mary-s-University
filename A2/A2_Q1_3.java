package CSCI1228.A2;

import java.util.Arrays;

public class A2_Q1_3 {
    public static void main(String[] args) {
        int[] list1={2,4,7,10};
        Arrays.fill(list1,7);
        System.out.println(Arrays.toString(list1));//Output: [7, 7, 7, 7]
        int[] list2 = {2,4,7,10};
        System.out.println(Arrays.toString(list2));
        System.out.println(Arrays.equals(list1,list2));
    }
}
