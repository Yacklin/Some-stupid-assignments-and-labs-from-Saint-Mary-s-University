package CSCI1228.A2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A2_Q1_2 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = new ArrayList<>(List.of(arr));
        Collections.reverse(list);
        arr = list.toArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
