package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class boxBlur {

    public static void main (String[]args){

        int[][] test = {{36,0,18,9},{1,7,1,1},{1,1,1,5}};

        int[][] test2 = boxBlur(test);
        for(int i=0;i<test2.length;i++){
            for(int j=0;j<test2[i].length;j++){
                System.out.print(test2[i][j]+" ");
            }
        }
    }


    public static int sumAround (int x ,int y ,int[][] inputArray){
        int sum =0;
        for(int i =x-1;i<=x+1;i++){
            for(int j=y-1;j<=y+1;j++){
                sum = inputArray[i][j]+sum;
            }
        }
        double aAverage  = sum/9;
        return (int) Math.round(aAverage);
    }


    public static int[][] boxBlur(int[][] image) {
        int limitRange = image.length-2;
        int limitRangey = image[0].length-2;
        int receive = 0;
        ArrayList <Integer> sumList = new ArrayList<>();
        for(int i =1;i<=limitRange;i++){
            for(int j=1;j<=limitRangey;j++){
                receive = sumAround(i,j,image);
                sumList.add(receive);
            }
        }
        int [][] returnArray = new int[limitRange][limitRangey];
        int index =0;

        for(int i=0;i<returnArray.length;i++){
            for(int j=0;j<returnArray[i].length;j++){
                returnArray[i][j] = sumList.get(index);
                index++;
            }
        }
        return returnArray;

    }

}
