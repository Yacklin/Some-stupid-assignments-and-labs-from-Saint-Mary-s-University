package CSCI1228;

public class Lab11 {
    public static void main(String[] args) {
        String[][][][] transactions = {
                // user 0
                {
                        { {"1101", "22.50"}, {"2103", "5.67"} }, // order 0 of user 0
                        { {"1101", "12.56"}, {"3405", "33.87"}, {"2205", "99.99"}}, // order 1 of user 0
                        { {"2401", "14.23"}} // order 2 of user 0
                },
                // user 1
                {
                        { {"2101", "12.55"}, {"2205", "99.99"} }, // order 0 of user 1
                        { {"1101", "18.97"}, {"2402", "10.01"} }, // order 1 of user 1
                },
                // user 2
                {
                        { {"2205", "99.99"} }, // order 0 of user 2
                },
                // user 3
                {
                        { {"2401", "7.87"} }, // order 0 of user 3
                        { {"1101", "15.50"}, {"2402", "12.23"} }, // order 1 of user 3
                },
                // user 4
                {
                        { {"2401", "18.37"}}, // order 0 of user 4
                        { {"3405", "20.70"}, {"2401", "8.98"} }, // order 1 of user 4
                        { {"1101", "17.68"}, {"2505", "2.43"}, {"4040", "10.99"}} // order 2 of user 4

                }
        };
        double sumForOrder;
        double sumForUser;
        for (int i = 0; i < transactions.length; i++) {
            sumForUser = 0;
            System.out.println("Summary for user "+i+":");
            for (int j = 0; j < transactions[i].length; j++) {
                sumForOrder=0;
                for (String[] submatrix:transactions[i][j]) {
                    sumForOrder+=Double.parseDouble(submatrix[1]);
                }
                sumForUser+=sumForOrder;
                System.out.printf("Order "+j+" total: $%.2f \n",sumForOrder);
            }
            System.out.printf("Total spending: $%.2f \n",sumForUser);
            System.out.println();
        }
    }
}
