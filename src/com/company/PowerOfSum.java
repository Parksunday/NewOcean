package com.company;

public class PowerOfSum {

    //initialize
    // Complete the powerSum function below.
    public static int powerSum(int X, int N) {

        return  powerSum(X,N,1);
    }

    public static int powerSum(int value, int power, int base){
        //calculate the current value
        int currentValue = (int)Math.pow(base,power);
        int remainValue = value-currentValue;
        if(currentValue>value){
            return 0;
        }
        if(currentValue==value){
            return 1;

        }
        // first recursive call is trying to see if the current base was a part of the solution
        // second recursive call is exploring the path that the current base was not a part of the solution

        return powerSum(value,power,base+1)+powerSum(remainValue,power,base+1);

    }
}
