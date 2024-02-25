package CSCI1228.A2;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122,2500.0);
        account.deposit(3000);
        System.out.printf("the balance is $%.2f \n", account.getBalance());
        System.out.printf("the annual interest rate is %.2f%%\n",account.getAnnualInterestRate()*100);
        System.out.printf("the monthly interest rate is %.2f%%\n", Account.getMonthlyInterestRate()*100);
        System.out.printf("the monthly interest is $%.2f\n",account.getMonthlyInterest());
        System.out.println("the account was created on "+account.getDateCreated());
    }
}
