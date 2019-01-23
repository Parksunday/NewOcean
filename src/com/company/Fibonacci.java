package com.company;

public class Fibonacci {

    public static void main (String[]args){
        System.out.print(fibonacci(1));

    }
    public static int fibonacci(int n) {

        if(n==0){
            return 0;
        }
        // Complete the function.
        if(n==1){
            return 1;
        }

        return fibonacci(n-2)+fibonacci(n-1);
    }

}
