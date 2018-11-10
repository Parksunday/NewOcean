package com.company;

public class AbosuluteSum {
    public int absoluteSum(int[]a){
        int len =a.length;
        if(len%2!=0){
            return a[(a.length-1)/2];
        }
        int half = a.length/2;
        int half2  = a.length/2-1;

        if(a[half]>a[half2]){
            return a[half2];
        }else{
            return a[half];
        }

    }
}
