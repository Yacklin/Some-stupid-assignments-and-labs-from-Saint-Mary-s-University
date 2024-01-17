package CSCI1228;
/**
 *CSCI1228
 * @author Yacklin Huang (A00475433)
 */

public class Question3_A1 {
   public static void main(String[] args) {
        //Print the values of a and abcdefgh with a width of 3 and a width of 5
        System.out.printf("%1$3s%2$5s\n", "a", "abcdefgh");
        //Print the values of 1 and Java with a width of 6 and a width of 8
        System.out.printf("%1$6b%2$-8s\n", 1>2, "Java");
        //Print the values of 312343 and 315562.932 with a width of 5 and a width of 6
        System.out.printf("%1$,5d %2$6.1f\n", 312343, 315562.932);
        //Print the values of 32 and 32.32 with a width of 05 and a width of 06
        System.out.printf("%1$05d %2$06.1f\n", 32, 32.32);
        //Print the values of 32178943229L and -35622.329 with a width of 10 and a width of +8
        System.out.printf("%1$,10d %2$+8.1f\n", 32178943229L, -35622.329);
    }
}