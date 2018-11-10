package com.company;

public class DepostiProfit {
    public static int depositProfit(int deposit, int rate, int threshold) {
        int year = 0;
        int balance = deposit;

        while(balance<threshold){
            balance = calculateDeposit(balance,rate);
            year++;


        }
        return year;
    }

    public static int calculateDeposit(int deposit, int rate){
        double depositx= deposit;
        double ratex =  rate;
        double result = depositx +((ratex/100)*depositx);

        return (int)result;
    }

    public  static  void main(String[]args){
        depositProfit(100,20,170);
    }
}
