package CSCI1228.A2;

public class A2_Q3_1And3 {
    public static void main(String[] args) {
        //(1) of Question3 of Assignment2
        int[][][] array3= {{{1,2},{3,4}},{{5,6},{7,8}}};
        System.out.println(array3[0][0][0]);
        System.out.println(array3[1][1][1]);

        //(3) of Question3 of Assignment2
        int[][] array = {{1,2},{3,4},{5,6}};
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i][0];
        }
        System.out.println(sum);
    }
}
