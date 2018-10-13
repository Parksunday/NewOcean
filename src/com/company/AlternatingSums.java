package com.company;

public class AlternatingSums {

    public static void main(String[]args){

    }

    public static int[] althernatingSums(int[] a){
        int sum1 = 0;
        int sum2 =0;

        for(int i =0;i<a.length;i++){
            if(i%2==0){
                sum1 += a[i];
            }else{
                sum2 +=a[i];
            }
        }

        int [] sumArray = new int [2];
        sumArray[0] =sum1;
        sumArray[1] =sum2;

        return  sumArray;
    }
}
