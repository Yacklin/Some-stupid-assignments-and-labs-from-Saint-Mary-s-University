package CSCI1228;

import java.util.Arrays;
import java.util.Scanner;

public class Lab09 {
    public static void main(String[] args) {
        int[] container;
        int[] container2;
        int numOfElements;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter list1 :");
        numOfElements = scanner.nextInt();
        container = new int[numOfElements];
        for (int j = 0; j < numOfElements; j++) {
            container[j] = scanner.nextInt();
        }
        System.out.println("please enter list2 :");
        numOfElements = scanner.nextInt();
        container2 = new int[numOfElements];
        for (int i = 0; i < numOfElements; i++) {
            container2[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(merge(container, container2)));
    }
    public static int[] merge(int[] container, int[] container2){
        int temp;
        int[] mergedlist;
        mergedlist = new int[container.length + container2.length];
        System.arraycopy(container, 0, mergedlist, 0, container.length);
        System.arraycopy(container2, 0, mergedlist, container.length, container2.length);
        for (int i = 0; i < mergedlist.length; i++) {
            for (int j = i+1; j <mergedlist.length ; j++) {
                if (mergedlist[i]> mergedlist[j]){
                    temp = mergedlist[i];
                    mergedlist[i] = mergedlist[j];
                    mergedlist[j] = temp;
                }
            }
        }
        return mergedlist;
    }
}
