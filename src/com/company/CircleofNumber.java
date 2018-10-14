package com.company;

public class CircleofNumber {

    int circleOfNumbers(int n, int firstNumber) {
        int color = 0;
        int plus = n/2;

        if(firstNumber==n/2){
            return 0;
        }

        if(firstNumber<n/2){
            return  firstNumber+plus;
        }

            return firstNumber-plus;
    }


}
