package CSCI1228.A2;

import java.util.Calendar;
import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0.012;
    private final Date dateCreated = new Date(118, Calendar.DECEMBER,19,13,6,50);
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    public Account() {}
    /**
     *
     * @return id
     */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     *
     * @return annualInterestRate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    /**
     *
     * @return dateCreated
     */
    public Date getDateCreated() {
        return dateCreated;
    }
    public static double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount) {
        if(amount>this.balance){
            System.out.println("Failure of Withdrawl");
        }else {
            this.balance-=amount;
        }
    }
    public void deposit(double amount) {
        if (amount>0){
            this.balance+=amount;
        }else {
            System.out.println("Failure of Deposit");
        }
    }

    public String toString() {
        return "Account{id = " + id + ", balance = " + balance + ", annualInterestRate = " + annualInterestRate + ", dateCreated = " + dateCreated + "}";
    }
}
