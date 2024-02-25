package CSCI1228.A2;

import java.util.Scanner;

public class MarkovMatrix {
    public static void main(String[] args) throws Throwable{
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a 3*3 matrix row by row :");
        double[][] matrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j]= scanner.nextDouble();
            }
            System.out.println();
        }
        if (isMarkovMatrix(matrix)){
            System.out.println("The matrix is Markov");
        }
        else {
            System.out.println("The matrix is not Markov");
        }
    }
    public static boolean isMarkovMatrix(double[][] matrix){
        boolean result = true;
        double sum;
        if(matrix.length != matrix[0].length){
            result = false;
        }
        outer:
        for (double[] submatrix:matrix) {
            for (double value:submatrix) {
                if (value< 0){
                    result = false;
                    break outer;
                }
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            sum=0;
            for (double[] Submatrix:matrix) {
                sum+=Submatrix[i];
            }
            if (sum != 1){
                result = false;
                break;
            }
        }
        return result;
    }
}
